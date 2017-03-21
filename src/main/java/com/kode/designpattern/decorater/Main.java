package com.kode.designpattern.decorater;

/**
 * 装饰器模式
 * 定义装饰器类，与被装饰的类继承同一个父类，定义装饰方法在装饰器类中调用
 * 装饰器模式松耦合，方便扩展功能
 * <p>
 * Created by zhongcy on 2017-03-02.
 */
public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decorater = new ConcreteDecorater(component);
        decorater.execute();
    }
}
