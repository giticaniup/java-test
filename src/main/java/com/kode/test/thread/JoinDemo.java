package com.kode.test.thread;

import java.util.concurrent.TimeUnit;

/**
 * join()方法，执行完join线程后继续执行
 * Created by zhongcy on 2016/9/27.
 */
public class JoinDemo {
    private static final int MAXIMUM_CAPACITY = 1 << 30;
    private static final  int MAX = 2<<29;
    public static void main(String[] args) throws InterruptedException {
        System.out.println(MAXIMUM_CAPACITY);
        System.out.println(MAX==MAXIMUM_CAPACITY);
        System.out.println("main Thread is running....");
        Thread01 thread01 = new Thread01();
        thread01.start();
        thread01.join();
        System.out.println("main Thread is over...");
    }
}

class Thread01 extends Thread {
    @Override
    public void run(){
        Thread021 thread021 = new Thread021();
        thread021.start();
        try {
            thread021.join();
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
class Thread021 extends Thread {
    @Override
    public void run(){
        System.out.println("thread2 is running");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread2 go on");
    }
}
