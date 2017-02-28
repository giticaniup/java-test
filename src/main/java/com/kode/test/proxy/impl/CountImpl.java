package com.kode.test.proxy.impl;


import com.kode.test.proxy.Count;

/**
 * Created by zhongcy on 2016/6/3.
 */
public class CountImpl implements Count {
    @Override
    public int count() {
        System.out.println("计数");
        return 1;
    }
}
