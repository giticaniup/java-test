package com.kode.test.encode;

import org.apache.commons.codec.digest.Crypt;

/**
 * Created by zhongcy on 2016/8/8.
 */
public class MD5EncryptDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
//            System.out.println(Md5Crypt.md5Crypt("admin".getBytes(),"admin"));
            System.out.println(Crypt.crypt("admin".getBytes()));
            System.out.println(Crypt.crypt("admin".getBytes(),"admin"));
        }
    }
}
