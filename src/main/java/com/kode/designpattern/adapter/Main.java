package com.kode.designpattern.adapter;

/**
 * 适配器模式：将一个类的接口转换成客户希望的另一个接口。
 * 适配器模式使得原本由于接口不兼容而不能一起工作的类可以在一起工作
 * target 和 adaptee本来由于接口的不一致是不能一起工作的。
 * 生成一个Adapter子类实现Target接口，在Adapter中实现target接口，在实现方法中调用父类方法，从而实现适配
 * Created by zhongcy on 2017-03-17.
 */
public class Main {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target target1 = new Adapter();
        target1.request();
    }
}
