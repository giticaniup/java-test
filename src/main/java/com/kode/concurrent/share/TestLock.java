package com.kode.concurrent.share;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试Lock.lock()的阻塞与中断
 * Created by zhongcy on 2017-03-07.
 */
public class TestLock {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            Thread child = new Thread(() -> {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + "is interrupted");
            }, "child-Thread");
            child.start();
            Thread.sleep(1000);
            child.interrupt();
            Thread.sleep(10000);
        }finally {
//            lock.unlock();
            System.out.println("不释放锁");
        }
    }
}
