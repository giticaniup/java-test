package com.kode.vm;

import java.util.ArrayList;
import java.util.List;

/**
 * 永久代内存溢出
 * Created by zhongcy on 2017/1/26.
 */
public class PermGenDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i).intern());
        }
    }
}
