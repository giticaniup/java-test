package com.kode.base;

/**
 * new String()是new对象
 * Created by zhongcy on 2017-03-05.
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("1");
        String s2 = new String("1");
        System.out.println(s1 == s2);

        String s3 = "1";
        String s4 = "1";
        System.out.println(s3 == s4);
    }
}
