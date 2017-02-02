package com.kode.vm;

/**
 * 内存分配
 * 如果对象在Eden出生后，熬过了一次GC，并且Survivor区有足够的空间，则进入Survivor区，并且年龄+1
 * 如果Survivor空间中相同年龄所有对象大小大于Survivor空间的一半，年龄大于或等于该年龄的对象直接进入老年代
 * Created by zhongcy on 2017/2/1.
 */
public class MinorGCDemo {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] bytes = new byte[2 * _1MB];
        byte[] bytes1 = new byte[2 * _1MB];
        byte[] bytes2 = new byte[2 * _1MB];
        byte[] bytes3 = new byte[4 * _1MB];
    }
}
