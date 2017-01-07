package com.kode.test.thread;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by zhongcy on 2016/12/19.
 */
public class Demo01 {
    private  String s;
    public synchronized void get(){}

    public static void main(String[] args) {
        Collections.synchronizedList(new ArrayList<>());
    }

}
