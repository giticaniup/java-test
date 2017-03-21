package com.kode.test.encode;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * Created by zhongcy on 2016/4/20.
 */
public class DecodeUtil {
    static Charset CHARSET = Charset.forName("utf-8");
    String token;
    String encodingAesKey;
    String appId;
    byte[] aesKey;

    /**
     * 构造方法，encodingAesKey必须是43位
     *
     * @param token
     * @param encodingAesKey
     * @param appId
     */
    public DecodeUtil(String token, String encodingAesKey, String appId) {
        if (encodingAesKey.length() != 43) {
            throw new RuntimeException("encodingAesKey length illegal");
        }
        this.token = token;
        this.encodingAesKey = encodingAesKey;
        this.appId = appId;
        aesKey = Base64.decodeBase64(encodingAesKey + "=");
    }

    public String decrypt(String text) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        SecretKeySpec key_spec = new SecretKeySpec(aesKey, "AES");
        for (int i = 0; i < aesKey.length; i++) {
            System.out.print(aesKey[i]);
        }
        IvParameterSpec iv = new IvParameterSpec(Arrays.copyOfRange(aesKey, 0, 16));
        cipher.init(Cipher.DECRYPT_MODE, key_spec, iv);

        byte[] base64Byte = Base64.decodeBase64(text);
        byte[] original = cipher.doFinal(base64Byte);

        byte[] bytes = PKCS7Encoder.decode(original);

        //网络字节码
        byte[] networkOrder = Arrays.copyOfRange(bytes, 16, 20);
        int length = recoverNetworkBytesOrder(networkOrder);

        String result = new String(Arrays.copyOfRange(bytes, 20, 20 + length), CHARSET);
        return result;
    }


    // 还原4个字节的网络字节序
    int recoverNetworkBytesOrder(byte[] orderBytes) {
        int sourceNumber = 0;
        for (int i = 0; i < 4; i++) {
            sourceNumber <<= 8;
            sourceNumber |= orderBytes[i] & 0xff;
        }
        return sourceNumber;
    }
}
