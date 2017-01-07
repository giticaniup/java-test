package com.kode.test.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection的父接口Iterable接口提供了forEach循环的支持，同时提供了forEach()方法的默认实现
 * Created by zhongcy on 2016/12/27.
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        list.forEach(System.out::println);
    }
}
