package com.kode.designpattern.observer;

/**
 * Created by zhongcy on 2017-03-02.
 */
public class ConcreteSubject extends Subject {
    @Override
    public void operate() {
        System.out.println("被观察者操作");
        super.notifyObserver();
    }
}
