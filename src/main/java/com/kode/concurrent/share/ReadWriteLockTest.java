package com.kode.concurrent.share;

import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 测试读写锁
 */
public class ReadWriteLockTest {
    public static void main(String[] args) {
        final RWQueue queue = new RWQueue();
        //三个线程读
        for (int i = 0; i < 3; i++) {
            new Thread() {
                public void run() {
                    while (true) {
                        queue.get();
                    }
                }
            }.start();
        }
        //三个线程写
        for (int i = 0; i < 3; i++) {
            new Thread() {
                public void run() {
                    while (true) {
                        queue.put(new Random().nextInt(10000));
                    }
                }
            }.start();
        }
    }
}

class RWQueue {
    private Object data = null;// 共享数据，只能有一个线程能写该数据，但可以有多个线程同时读该数据。
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public void get() {
        rwl.readLock().lock();// 上读锁，其他线程只能读不能写
        System.out.println(Thread.currentThread().getName()
                + " be ready to read data!");
        try {
            Thread.sleep((long) (Math.random() * 1000));
            System.out.println(Thread.currentThread().getName()
                    + "have read data :" + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            rwl.readLock().unlock();
        }
    }

    public void put(Object data) {
        rwl.writeLock().lock();// 上写锁，不允许其他线程读也不允许写
        System.out.println(Thread.currentThread().getName()
                + " be ready to write data!");
        try {
            Thread.sleep((long) (Math.random() * 1000));
            this.data = data;
            System.out.println(Thread.currentThread().getName()
                    + " have write data: " + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            rwl.writeLock().unlock();// 释放写锁
        }
    }
}