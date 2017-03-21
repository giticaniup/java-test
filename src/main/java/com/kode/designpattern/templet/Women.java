package com.kode.designpattern.templet;

/**
 * Created by zhongcy on 2017-02-27.
 */
public class Women extends AbstractHuman {
    @Override
    protected void stand() {
        System.out.println("women stand");
    }

    @Override
    protected void wear() {
        System.out.println("women wear slowly");
    }
}
