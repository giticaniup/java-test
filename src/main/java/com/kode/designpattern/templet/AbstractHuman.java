package com.kode.designpattern.templet;

/**
 * Created by zhongcy on 2017-02-27.
 */
public abstract class AbstractHuman {
    protected abstract void stand();

    protected abstract void wear();

    public final void wakeup() {
        this.stand();
        this.wear();
    }
}
