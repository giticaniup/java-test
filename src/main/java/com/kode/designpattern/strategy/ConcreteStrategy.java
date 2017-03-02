package com.kode.designpattern.strategy;

/**
 * Created by zhongcy on 2017-03-02.
 */
public class ConcreteStrategy extends Strategy{
    @Override
    public void execute() {
        System.out.println("具体的策略执行");
    }
}
