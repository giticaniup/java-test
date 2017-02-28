package com.kode.designpattern.factory;

/**
 * 抽象工厂类
 * Created by zhongcy on 2017-02-27.
 */
public abstract class AbstractFactory {
    public  abstract   <T extends AbstractProduct> T create(Class<T> clazz);
}
