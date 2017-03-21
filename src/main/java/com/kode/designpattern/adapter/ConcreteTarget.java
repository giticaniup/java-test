package com.kode.designpattern.adapter;

/**
 * 实现类
 * Created by zhongcy on 2017-03-17.
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("具体的target实现");
    }
}
