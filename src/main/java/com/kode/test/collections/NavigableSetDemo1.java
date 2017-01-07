package com.kode.test.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * TreeSet实现了NavigableSet，提供了一系列的方法如ceiling/higher，以及subSet这样的方法
 * Created by zhongcy on 2017/1/4.
 */
public class NavigableSetDemo1 {
    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        System.out.println(set.ceiling("2"));
        System.out.println(set.higher("2"));
    }
}
