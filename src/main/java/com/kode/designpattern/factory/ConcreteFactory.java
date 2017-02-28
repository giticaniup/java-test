package com.kode.designpattern.factory;

/**
 *  工厂实现类
 * Created by zhongcy on 2017-02-27.
 */
public class ConcreteFactory extends AbstractFactory {
    @Override
    public <T extends AbstractProduct> T create(Class<T> clazz) {
        try {
            return (T)Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
