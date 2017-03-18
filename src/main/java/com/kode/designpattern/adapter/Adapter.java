package com.kode.designpattern.adapter;

/**
 * Created by zhongcy on 2017-03-17.
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        System.out.println("adapter is doing");
        super.doSomething();
    }
}
