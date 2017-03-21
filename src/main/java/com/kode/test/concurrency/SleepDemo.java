package com.kode.test.concurrency;

/**
 * 响应中断
 * Created by zhongcy on 2017/1/19.
 */
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        SleepThread st = new SleepThread();
        st.start();
        st.interrupt();
        Thread.sleep(1000);
        System.out.println(st.getName() + st.isInterrupted());
    }
}

class SleepThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("1" + getState());
                sleep(1000);
                System.out.println("2" + getState());
                System.out.println("after");
            }
        } catch (InterruptedException e) {
//            Thread.interrupted();
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().getName() + Thread.currentThread().isInterrupted());
            System.out.println("exception");
            System.out.println(getState());
        }
    }
}