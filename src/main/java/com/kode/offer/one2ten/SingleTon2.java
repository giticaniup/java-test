package com.kode.offer.one2ten;

/**
 * 单例的实现方式：懒汉、饿汉、双重锁、静态内部类、枚举
 * 本例为静态内部类，好处在于不用加锁，并且延迟加载
 * Created by zhongcy on 2017/2/9.
 */
public class SingleTon2 {
    private static class SingleTonHolder {
        private static final SingleTon2 INSTANCE = new SingleTon2();
    }

    private SingleTon2() {
    }

    public static SingleTon2 instance() {
        return SingleTonHolder.INSTANCE;
    }
}
