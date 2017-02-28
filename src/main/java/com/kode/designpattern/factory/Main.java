package com.kode.designpattern.factory;

/**
 * Created by zhongcy on 2017-02-27.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        AbstractProduct product = factory.create(ConcreteProduct.class);
        product.different();
    }
}
