package com.kode.designpattern.dutychain;

/**
 * Created by zhongcy on 2017-03-02.
 */
public class Boss extends Handler {
    @Override
    public void handle(int day) {
        if (day >= 10) {
            System.out.println("boss处理");
        } else {
            if (getSuccessor() != null) {
                getSuccessor().handle(day);
            }
        }
    }
}
