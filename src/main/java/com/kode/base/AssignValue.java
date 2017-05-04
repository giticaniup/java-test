package com.kode.base;

import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;

/**
 * 赋值
 * Created by kodezhong on 2017/4/28.
 */
public class AssignValue {
    @org.junit.Test
    public void test() throws UnsupportedEncodingException {
        String a = "a";
        String b = a;
        a = "aa";
        System.out.println(a);
        System.out.println(b);
        System.out.println(10.0/3);
        System.out.println("中文".getBytes("GBK").length);
        System.out.println("中文".getBytes("GB2312").length);
        System.out.println("中文繁体".getBytes("UTF-8").length);
        System.out.println("中文繁体".getBytes("UTF-16").length);
    }
}
