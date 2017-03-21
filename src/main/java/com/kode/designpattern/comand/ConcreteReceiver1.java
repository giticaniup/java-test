package com.kode.designpattern.comand;

/**
 * 具体接收者1，可以做一些事情
 * Created by zhongcy on 2017-03-01.
 */
public class ConcreteReceiver1 extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("concreteReceiver1 doing something");
    }
}
