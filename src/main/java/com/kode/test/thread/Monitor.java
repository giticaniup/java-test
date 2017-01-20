package com.kode.test.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhongcy on 2016/9/23.
 */
public class Monitor {

    public static void main(String[] args) throws InterruptedException {
        Thread10 thread1 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread1.start();
        thread20.start();
        TimeUnit.SECONDS.sleep(2);
        thread20.noAll();
    }
}

class Thread10 extends Thread {
    @Override
    public synchronized void run() {
        System.out.println("thread1 run...");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程1被唤醒");
    }
}

class Thread20 extends Thread {
    @Override
    public synchronized void run() {
        try {
            System.out.println("thread2 run...");
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程2被唤醒");
    }

    public synchronized void noAll() throws InterruptedException {
        notifyAll();
    }
}
