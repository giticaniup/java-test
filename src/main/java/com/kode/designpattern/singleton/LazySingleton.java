package com.kode.designpattern.singleton;

/**
 * 懒汉
 * 优点： 只有在使用时才会实例化单例，一定程度上节约了资源。
 * 缺点： 第一次加载时要立即实例化，反应稍慢。每次调用getInstance()方法都会进行同步，这样会消耗不必要的资源。这种模式一般不建议使用。
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
