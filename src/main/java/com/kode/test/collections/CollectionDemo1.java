package com.kode.test.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhongcy on 2016/12/26.
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        list.removeIf("1"::equals);
        System.out.println(list);
    }
}
