package com.kode.test.concurrency;

import org.junit.Test;

/**
 * Runnable退出，线程池Main函数不退出
 * Created by zhongcy on 2017/1/18.
 */
public class RunnableDemo {

    public static void main(String[] args) {
        MyThread increase = new MyThread();
        Thread thread = new Thread(increase);
        thread.start();
        My2 my2 = new My2();
        my2.start();
    }
    @Test
    public void testRunnable() {
        System.out.println("11");
        MyThread increase = new MyThread();
        Thread thread = new Thread(increase);
        thread.start();
        My2 my2 = new My2();
        my2.start();
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程开始：" + ",i=" + i);
        }
    }
}

class My2 extends Thread{
    @Override
    public void run(){
        System.out.println(1);
    }
}