package com.kode.test;

/**
 * Created by zhongcy on 2016/9/30.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "1".concat("2").concat("3").concat("4");
        String s1 = "1" + "2" + "3" + System.lineSeparator();
        System.out.println(s);
        System.out.println(s1);
    }
}
