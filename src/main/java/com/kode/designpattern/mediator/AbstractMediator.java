package com.kode.designpattern.mediator;

/**
 * Created by zhongcy on 2017-03-01.
 */
public abstract class AbstractMediator {
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    public abstract void excute(String s, Object... objects);
}
