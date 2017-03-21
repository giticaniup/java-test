package com.kode.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhongcy on 2017-03-05.
 */
public class ListDemo {

    public static void main(String[] args) {
        List<String> vector = new ArrayList<>();
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    vector.remove(1);
                    vector.forEach(System.out::println);
                }
            }
        }).start();
        for (int i = 5; i < 100; i++) {
            vector.add(String.valueOf(i));
        }
    }
}
