package com.kode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单测试
 * Created by zhongcy on 2017/2/8.
 */
public class Test {
    public static void main(String[] args) {
        int result = 1;
        result = -result;
        System.out.println(result);

        char c='1';
        int ic = c;
        System.out.println(ic);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2,31));
        System.out.println(Integer.MIN_VALUE);

        List list = new ArrayList();
        list.forEach(System.out::println);
        Double d = Double.MAX_VALUE-1000000;
        System.out.println("long"+Long.MAX_VALUE);
        System.out.println("double"+d.longValue());
    }
}
