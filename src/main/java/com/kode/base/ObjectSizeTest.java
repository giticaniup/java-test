package com.kode.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过创建多个对象来看每个对象的大小
 * Created by zhongchengyong on 2017/4/21.
 */
public class ObjectSizeTest {
    public static void main(String[] args) throws InterruptedException {
        List<EmptyClass> emptyClasses = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            EmptyClass emptyClass = new EmptyClass();
            emptyClasses.add(emptyClass);
            Thread.sleep(120 * 1000);
        }
    }

    static class EmptyClass {

    }
}
