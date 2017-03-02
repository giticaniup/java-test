package com.kode.designpattern.observer.better;

import java.util.Observable;

/**
 * Created by zhongcy on 2017-03-02.
 */
public class BetterSubject extends Observable{
    public void operate(){
        System.out.println("被观察者操作");
        setChanged();
        notifyObservers("test");
    }
}
