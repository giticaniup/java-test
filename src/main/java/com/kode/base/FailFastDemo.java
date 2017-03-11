package com.kode.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhongcy on 2017-03-05.
 */
public class FailFastDemo {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        for(int i = 0;i<10;i++){
            list.add("1");
        }
    }
}
