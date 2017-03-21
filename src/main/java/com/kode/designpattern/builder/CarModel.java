package com.kode.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 汽车模型——product接口
 * Created by zhongcy on 2017-02-28.
 */
public abstract class CarModel {
    List<String> seq = new ArrayList<>();

    abstract void boom();

    abstract void alarm();

    abstract void start();

    abstract void stop();

    void run() {
        for (String s : seq) {
            if ("boom".equals(s)) {
                boom();
            }
            if ("alarm".equals(s)) {
                alarm();
            }
            if ("start".equals(s)) {
                start();
            }
            if ("stop".equals(s)) {
                stop();
            }
        }
    }

    public final void setSeq(List<String> seq) {
        this.seq = seq;
    }
}
