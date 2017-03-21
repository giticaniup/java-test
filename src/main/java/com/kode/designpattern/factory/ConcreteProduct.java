package com.kode.designpattern.factory;

/**
 * 产品具体类
 * Created by zhongcy on 2017-02-27.
 */
public class ConcreteProduct extends AbstractProduct {
    @Override
    public void different() {
        System.out.println("I am Product1");
    }
}
