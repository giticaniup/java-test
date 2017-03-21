package com.kode.test.proxy.impl;

/**
 * 被代理类
 * Created by zhongcy on 2016/6/3.
 */
public class CgLibCounter {
    public void count(int i) {
        System.out.println("begin count:" + i);
    }
}
