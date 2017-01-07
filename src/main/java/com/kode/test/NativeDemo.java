package com.kode.test;

/**
 * native修饰不用方法体
 * Created by zhongcy on 2016/12/19.
 */
public class NativeDemo {
    public native void getNative();

    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hello";
        StringBuffer sb = new StringBuffer("Hello");
        String sbStr = sb.toString();
        System.out.println(s==s1);
        System.out.println(s==sbStr);
        System.out.println(1<<4);
        System.out.println(1<<3);
    }
}
