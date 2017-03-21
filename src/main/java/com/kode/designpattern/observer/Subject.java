package com.kode.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhongcy on 2017-03-02.
 */
public abstract class Subject {

    protected List<Observer> observerList = new ArrayList<>();

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void delete(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        observerList.forEach(Observer::update);
    }

    public abstract void operate();
}
