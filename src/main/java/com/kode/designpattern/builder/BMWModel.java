package com.kode.designpattern.builder;

/**
 * Created by zhongcy on 2017-02-28.
 */
public class BMWModel extends CarModel{
    @Override
    public void boom() {
        System.out.println("BMW boom");
    }

    @Override
    public void alarm() {
        System.out.println("BMW alarm");
    }

    @Override
    public void start() {
        System.out.println("BMW start");
    }

    @Override
    public void stop() {
        System.out.println("BMW stop");
    }
}
