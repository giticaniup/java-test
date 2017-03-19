package com.kode.test.math;

/**
 * Created by zhongcy on 2017-03-18.
 */
public class PlusDemo {
    public static void main(String[] args) {
        int x = 10;
        x++;
        x+=x-=x-x++;
        System.out.println(x);
    }
}
