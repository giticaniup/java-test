package com.kode.designpattern.templet;

/**
 * 把共同的方法wakeup()放在抽象类或接口中实现
 * 非常便于功能的扩展，例如spring框架中扩展某一块的功能
 * Created by zhongcy on 2017-02-27.
 */
public class Main {
    public static void main(String[] args) {
        AbstractHuman human1 = new Man();
        AbstractHuman human2 = new Women();
        human1.wakeup();
        human2.wakeup();
    }
}
