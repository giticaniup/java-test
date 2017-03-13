package com.kode.vm;

/**
 * 第一个执行的结果为false，因为java在常量池中的已经有这样一个字符串，.intern()方法返回的是旧对象，两个不是同一个对象。
 * 第二个执行结果为true，因为对象是第一次创建，两个对象是同一个对象
 * Created by zhongcy on 2017/1/26.
 */
public class StringIntern {
    public static void main(String[] args) {
        String str = new StringBuilder("ja").append("va").toString();
        System.out.println(str.intern() == str);
        String strTest = new StringBuilder("计算机").append("互联网").toString();
        System.out.println(strTest.intern() == strTest);

        String str1 = "a";
        String str2 = "b";
        String str3 = "ab";
        String str4 = str1 + str2;
        String str5 = new String("ab");

        System.out.println(str5.equals(str3));
        System.out.println(str5 == str3);
        //intern返回string池中的对象，如果池中含有一个对象则返回，否则创建
        System.out.println(str5.intern() == str3);
        System.out.println(str5.intern() == str4);
    }
}
