package com.kode.vm;

/**
 * 拆装箱例子
 * Created by zhongcy on 2017-02-14.
 */
public class BoxDemo {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        //拆箱
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
    }


}
