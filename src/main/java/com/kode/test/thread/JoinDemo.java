package com.kode.test.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhongcy on 2016/9/27.
 */
public class JoinDemo {
    private static final int MAXIMUM_CAPACITY = 1 << 30;
    private static final  int MAX = 2<<29;
    public static void main(String[] args) throws InterruptedException {
        System.out.println(MAX==MAXIMUM_CAPACITY);
        System.out.println("main Thread is running....");
        Thread1 thread1 = new Thread1();
        thread1.start();
        thread1.join();
        System.out.println("main Thread is over...");
    }
}

class Thread1 extends Thread {
    @Override
    public void run(){
        Thread2 thread2 = new Thread2();
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread1 is running");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Thread2 extends Thread {
    @Override
    public void run(){
        System.out.println("thread2 is running");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
