package com.kode.base;

import java.util.Vector;

/**
 * Created by zhongcy on 2017-03-05.
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    vector.forEach(System.out::println);
                }
            }
        }).start();
        for (int i = 5;i<100;i++){
            vector.add(String.valueOf(i));
        }
    }
}
