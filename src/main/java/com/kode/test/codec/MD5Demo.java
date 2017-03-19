package com.kode.test.codec;

import org.apache.commons.codec.digest.Md5Crypt;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Arrays;

/**
 * Created by zhongcy on 2017-03-18.
 */
public class MD5Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(Md5Crypt.apr1Crypt("jklmn"));
        System.out.println(Md5Crypt.md5Crypt("jklmn".getBytes("utf-8")));
        System.out.println(md5("jklmn"));
    }

    public static String md5(String source) {
        StringBuffer sb = new StringBuffer(32);
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            //生成byte数组
            byte[] array = md.digest(source.getBytes("utf-8"));
            System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length; i++) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).toUpperCase().substring(1, 3));
            }
        } catch (Exception e) {
            System.out.println("Can not encode the string '" + source + "' to MD5!");
            return null;
        }
        return sb.toString();
    }
}
