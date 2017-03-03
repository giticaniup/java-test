package com.kode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by zhongcy on 2017-03-03.
 */
public class ListListDemo {
    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
        lists.add(Arrays.asList("1,2"));
        lists.add(Arrays.asList("3,4"));
        System.out.println(lists);
    }
}
