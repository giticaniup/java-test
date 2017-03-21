package com.kode.concurrent;

/**
 * Created by zhongcy on 2017/2/6.
 */
public class ThreadDemo6 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new TestTask()).start();
        }
    }

}

class TestTask implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 2) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            i++;
        }
    }
}
