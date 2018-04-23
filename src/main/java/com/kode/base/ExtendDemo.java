package com.kode.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhongchengyong on 2018/3/8.
 */

public class ExtendDemo {
    public static void main(String[] args) {
        List<Base> bases = new ArrayList<>();
        bases.add(new Derived());
        for (Base b : bases){
            b.print();
        }
    }
}
