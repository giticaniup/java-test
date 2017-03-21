package com.kode.designpattern.observer;

/**
 * Created by zhongcy on 2017-03-02.
 */
public class ConcreteObserver extends Observer {
    @Override
    public void update() {
        System.out.println("I am update");
    }
}
