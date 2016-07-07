package com.kode.test.encode;

import org.apache.commons.codec.binary.Base64;

/**
 * Created by zhongcy on 2016/4/20.
 */
public class Base64Demo {
    public static void main(String[] args) {
        String encodingAESKey="x45sdf3sd1231231232xsx45sdf3sd1231231232xsx";
        byte[] aesKey= Base64.decodeBase64(encodingAESKey+"=");
        for (byte b:aesKey){
            System.out.println(aesKey.length);
            System.out.print(b);
        }
    }
}
