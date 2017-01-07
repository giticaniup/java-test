package com.kode.test.test;

/**
 * Created by zhongcy on 2016/11/3.
 */
class NumberThread implements Runnable {

    int i = 1;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        NumberThread numberThread = new NumberThread();
        Thread t1 = new Thread(numberThread);

        t1.start();
        Thread.sleep(1000);
        System.out.println("change i to 2");
        numberThread.i=2;
    }
}
