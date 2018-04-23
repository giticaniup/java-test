package com.kode.base;

/**
 * Created by zhongchengyong on 2017/9/3.
 */
public class Derived extends Base {

    public int test(int i) {
        System.out.println(i);
        return i;
    }

    @Override
    void print() {
        System.out.println("Derived");
    }
}
