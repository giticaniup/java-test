package com.kode.designpattern.strategy;

/**
 * Created by zhongcy on 2017-03-02.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void work(){
        this.strategy.execute();
    }
}
