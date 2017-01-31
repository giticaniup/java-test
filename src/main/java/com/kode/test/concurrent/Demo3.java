package com.kode.test.concurrent;


import java.util.ArrayList;
import java.util.List;

/**
 * Final是什么？Final就是本身不能改，但是对象可以改
 * Created by zhongcy on 2017/1/7.
 */
public class Demo3 {
    public static void main(String[] args) {
        final List list = new ArrayList<>();
        list.add("a");

    }
}
