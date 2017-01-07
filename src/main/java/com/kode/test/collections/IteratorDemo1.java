package com.kode.test.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * forEachRemaining()方法接收一个consumer，并会调用next()方法
 * Created by zhongcy on 2016/12/26.
 */
public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.forEachRemaining(System.out::println);
        }
    }
}
