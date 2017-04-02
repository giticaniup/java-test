package com.kode.designpattern.strategy;

/**
 * 策略模式：定义接口的一系列的算法，把算法封装起来，算法间可以替换
 * 在具体使用的时候确定调用哪个实现，与java 的多态如出一辙
 * Created by zhongcy on 2017-03-02.
 */
public class Main {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy();
        Context context = new Context(strategy);
        context.work();
    }
}
