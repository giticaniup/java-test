package com.kode.test.encode;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.util.Random;

/**
 * Created by zhongcy on 2016/4/20.
 */
public class EncodeUtil {
    Base64 base64 = new Base64();
    static Charset CHARSET = Charset.forName("utf-8");
    String token;
    String encodingAesKey;
    String appId;
    byte[] aesKey;

    public EncodeUtil(String token, String encodingAesKey, String appId) {
        if (encodingAesKey.length() != 43) {
            throw new RuntimeException("encodingAesKey length illegal");
        }
        this.token = token;
        this.encodingAesKey = encodingAesKey;
        this.appId = appId;
        aesKey = Base64.decodeBase64(encodingAesKey + "=");
    }

    /**
     * 生成一个16位的串
     *
     * @return
     */
    String getRandomStr() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 16; i++) {
            int pos = random.nextInt(str.length());
            sb.append(str.charAt(pos));
        }
        return sb.toString();
    }

    public String encrypt(String randomStr, String text) throws Exception {
        ByteGroup byteGroup = new ByteGroup();
        byte[] randomByte = randomStr.getBytes(CHARSET);
        byte[] textBytes = text.getBytes(CHARSET);
        System.out.println("中文获取编码");
        for (byte b : textBytes) {
            System.out.print(b);
        }
        System.out.println();
        byte[] netWorkOrder = getNetworkBytesOrder(textBytes.length);
        //byte[] appIdBytes = appId.getBytes(CHARSET);

        byteGroup.addBytes(randomByte);
        byteGroup.addBytes(netWorkOrder);
        byteGroup.addBytes(textBytes);
        //byteGroup.addBytes(appIdBytes);

        //补位填充
        byte[] padBytes = PKCS7Encoder.encode(byteGroup.size());
        byteGroup.addBytes(padBytes);

        byte[] originnalByte = byteGroup.toBytes();

        // 设置加密模式为AES的CBC模式
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        SecretKeySpec keySpec = new SecretKeySpec(aesKey, "AES");
        IvParameterSpec iv = new IvParameterSpec(aesKey, 0, 16);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, iv);

        // 加密
        byte[] encrypted = cipher.doFinal(originnalByte);

        // 使用BASE64对加密后的字符串进行编码
        String base64Encrypted = base64.encodeToString(encrypted);

        return base64Encrypted;
    }

    // 生成4个字节的网络字节序
    byte[] getNetworkBytesOrder(int sourceNumber) {
        byte[] orderBytes = new byte[4];
        orderBytes[3] = (byte) (sourceNumber & 0xFF);
        orderBytes[2] = (byte) (sourceNumber >> 8 & 0xFF);
        orderBytes[1] = (byte) (sourceNumber >> 16 & 0xFF);
        orderBytes[0] = (byte) (sourceNumber >> 24 & 0xFF);
        return orderBytes;
    }
}
