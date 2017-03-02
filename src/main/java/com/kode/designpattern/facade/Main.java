package com.kode.designpattern.facade;

/**
 * 门面模式
 * 封装子系统，对外部提供同一的调用
 * Created by zhongcy on 2017-03-02.
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method1();
    }
}
