package com.kode.test.proxy.main;


import com.kode.test.proxy.impl.CountImpl;
import com.kode.test.proxy.impl.CountProxy;

/**
 * Created by zhongcy on 2016/6/3.
 */
public class Main {
    public static void main(String[] args) {
        CountImpl count = new CountImpl();
        CountProxy countProxy = new CountProxy(count);
        countProxy.count();
    }
}
