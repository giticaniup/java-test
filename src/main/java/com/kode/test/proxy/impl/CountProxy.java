package com.kode.test.proxy.impl;


import com.kode.test.proxy.Count;

/**
 * Created by zhongcy on 2016/6/3.
 */
public class CountProxy implements Count {
    private CountImpl count;

    public CountProxy(CountImpl count){
        this.count = count;
    }
    public void count() {
        System.out.println("计数前");
        count.count();
    }
}
