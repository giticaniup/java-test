package com.kode.designpattern.observer.better;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhongcy on 2017-03-02.
 */
public class BetterObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("java提供的observer接口更新");
    }
}
