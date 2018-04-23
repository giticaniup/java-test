package com.kode.designpattern.singleton;

/**
 * DCL + volatile
 * 由于可能存在的指令重排，可能创建对象的过程为：
 * 1.分配内存空间
 * 2.将内存空间的地址赋值给对应的引用
 * 3.初始化对象
 * 这也就导致访问的instance对象导致错误
 */
public class DCLSingleton {

    private volatile static DCLSingleton instance;

    private DCLSingleton() {

    }

    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
