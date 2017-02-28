package com.kode.designpattern.templet;

/**
 * Created by zhongcy on 2017-02-27.
 */
public class Man extends AbstractHuman{
    @Override
    protected void stand() {
        System.out.println("man stand");
    }

    @Override
    protected void wear() {
        System.out.println("man wear is quickly");
    }
}
