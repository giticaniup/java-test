package com.kode.offer.one2ten;

/**
 * 单例模式
 * volatile+同步代码块 实现安全单例
 * Created by zhongcy on 2017/2/9.
 */
public class SingleTon {

    private SingleTon() {

    }

    private static volatile SingleTon instance;

    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                instance = new SingleTon();
            }
        }
        return instance;
    }
}
