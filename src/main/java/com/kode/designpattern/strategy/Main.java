package com.kode.designpattern.strategy;

/**
 * 把要做的事情包装到Context中，与装饰器模式不同的是，Wrapper类不继承同一父类
 * Created by zhongcy on 2017-03-02.
 */
public class Main {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy();
        Context context = new Context(strategy);
        context.work();
    }
}
