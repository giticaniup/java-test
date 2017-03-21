package com.kode.concurrent.share;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试lockInterruptibly()方法的中断
 * Created by zhongcy on 2017-03-07.
 */
public class TestLockInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            Thread child = new Thread(() -> {
                try {
                    lock.lockInterruptibly();
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + "is interrupted");
                }
            });
            child.start();
            Thread.sleep(1000);
            child.interrupt();
            Thread.sleep(10000);
        } finally {
            lock.unlock();
        }
    }
}
