package com.kode.test.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * retainAll
 * Created by zhongcy on 2016/12/26.
 */
public class IteratorDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        Iterator<String> iterator = list.iterator();
        iterator.next();
        iterator.remove();
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("g");
        list1.add("s");
        list1.add("a");
        list1.add("f");
        list2.add("g");
        list2.add("c");
        list2.add("b");
        list2.add("a");
        list1.retainAll(list2);
        System.out.print(list1);
    }
}
