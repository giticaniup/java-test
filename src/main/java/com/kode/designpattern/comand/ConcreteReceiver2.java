package com.kode.designpattern.comand;

/**
 *  具体接收者2，可以做一些事情
 * Created by zhongcy on 2017-03-01.
 */
public class ConcreteReceiver2 extends Receiver{
    @Override
    public void doSomething() {
        System.out.println("concreteReceiver2 doing something");
    }
}
