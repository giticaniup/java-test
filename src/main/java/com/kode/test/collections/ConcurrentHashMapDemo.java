package com.kode.test.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap的key值不允许为空
 * Created by zhongcy on 2017-02-15.
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(10);
        Set<String> set = new HashSet<>(list);
        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put(null, "1");
        System.out.println();
    }
}
