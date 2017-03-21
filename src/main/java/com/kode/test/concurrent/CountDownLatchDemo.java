package com.kode.test.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * 闭锁测试
 * Created by zhongcy on 2017-02-26.
 */
public class CountDownLatchDemo {
    public static long timeTasks(int tNum) throws InterruptedException {
        CountDownLatch startGate = new CountDownLatch(1);
        CountDownLatch endGate = new CountDownLatch(tNum);
        for (int i = 0; i < tNum; i++) {
            final int j = i;
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Worker阻塞");
                        startGate.await();
//                        System.out.println(j);
                        endGate.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.start();
        }
        long start = System.nanoTime();
        System.out.println("Main 减小");
        startGate.countDown();
        //等工作线程
        System.out.println("Main 阻塞");
        endGate.await();
        long endTime = System.nanoTime();
        return endTime - start;
    }

    public static void main(String[] args) throws InterruptedException {
//        System.out.println(timeTasks(10));
        simpleCD();
    }

    private static void simpleCD() throws InterruptedException {
        CountDownLatch startGate = new CountDownLatch(1);
        startGate.await();
    }
}
