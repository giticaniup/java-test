package com.kode.designpattern.observer;

/**
 * 观察者模式
 * 当被观察者有所动作时，通知观察者做对应动作
 * Created by zhongcy on 2017-03-02.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.add(new ConcreteObserver());
        subject.operate();
    }
}
