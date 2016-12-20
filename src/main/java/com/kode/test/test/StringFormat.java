package com.kode.test.test;

/**
 * Created by zhongcy on 2016/11/9.
 */
public class StringFormat {
    public static void main(String[] args) {
        String s = "121212.12122121";
        String result = String.format("%.2f", s);
        System.out.println(s);
        System.out.println(result);
    }
}
