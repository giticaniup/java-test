package com.kode.designpattern.singleton;

/**
 * 静态内部类实现单例模式
 */
public class InnerSingleton {
    private InnerSingleton() {
    }

    public static InnerSingleton getInstance() {
        return SingletonHolder.instance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static InnerSingleton instance = new InnerSingleton();
    }
}