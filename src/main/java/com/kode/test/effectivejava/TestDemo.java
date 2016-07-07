package com.kode.test.effectivejava;

/**
 * Created by zhongcy on 2016/5/4.
 */
public class TestDemo {
    public static void increase(int i){
        i++;
        System.out.println(i);
    }

    public static void main(String[] args) {
        //1462759011489
        //1462759800000
        System.out.println(System.currentTimeMillis());
        int i=0;
        increase(i);
        System.out.println(i);
    }
}
