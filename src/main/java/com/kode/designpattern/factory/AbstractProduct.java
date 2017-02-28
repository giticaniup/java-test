package com.kode.designpattern.factory;

/**
 * 产品抽象类
 * Created by zhongcy on 2017-02-27.
 */
public abstract class AbstractProduct {
    public void use() {
        System.out.println("product can use");
    }

    public abstract void different();
}
