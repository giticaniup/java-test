package com.kode.designpattern.dutychain;

/**
 * Created by zhongcy on 2017-03-01.
 */
public abstract class Handler {

    private Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle(int day);
}
