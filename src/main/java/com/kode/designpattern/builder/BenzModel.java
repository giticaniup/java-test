package com.kode.designpattern.builder;

/**
 * 奔驰模型
 * Created by zhongcy on 2017-02-28.
 */
public class BenzModel extends CarModel {
    @Override
    public void boom() {
        System.out.println("Benz boom");
    }

    @Override
    public void alarm() {
        System.out.println("Benz alarm");
    }

    @Override
    public void start() {
        System.out.println("Benz start");
    }

    @Override
    public void stop() {
        System.out.println("Benz stop");
    }


}
