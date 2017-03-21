package com.kode.test.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 清除List的第一个元素没有报错，清除第二个元素报错
 * Created by zhongcy on 2017-02-15.
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("1");
        a.add("2");
        for (String str : a) {
            if ("1".equals(str)) {
                a.remove(str);
            }
        }
        System.out.println(a);
    }
}
