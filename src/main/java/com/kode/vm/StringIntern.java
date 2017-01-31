package com.kode.vm;

/**
 * 第一个执行的结果为false，因为java在常量池中的已经有这样一个字符串，.intern()方法返回的是旧对象，两个不是同一个对象。
 * 第二个执行结果为true，因为对象是第一次创建，两个对象是同一个对象
 * Created by zhongcy on 2017/1/26.
 */
public class StringIntern {
    public static void main(String[] args) {
        String str = new StringBuilder("ja").append("va").toString();
        System.out.println(str.intern()==str);
        String str1 = new StringBuilder("计算机").append("互联网").toString();
        System.out.println(str1.intern()==str1);
    }
}
