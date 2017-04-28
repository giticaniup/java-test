package com.kode.base;

/**
 * 赋值
 * Created by kodezhong on 2017/4/28.
 */
public class AssignValue {
    @org.junit.Test
    public void test() {
        String a = "a";
        String b = a;
        a = "aa";
        System.out.println(a);
        System.out.println(b);
        System.out.println(10.0/3);
    }
}
