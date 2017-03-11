package com.kode.concurrent.share;

import java.util.concurrent.atomic.AtomicReference;

/**
 * AtomicReference测试
 * 仅有一个线程可以操作成功
 * Created by zhongcy on 2017-03-06.
 */
public class AtomicReferenceDemo {
    public static void main(String[] args) {
        AtomicReference<String> atomicString = new AtomicReference<>("tom");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                if (atomicString.compareAndSet("tom", "jerry")) {
                    System.out.println(Thread.currentThread().getName() + ":set success");
                } else {
                    System.out.println(Thread.currentThread().getName() + ":set failed");
                }
            }).start();
        }
    }
}
