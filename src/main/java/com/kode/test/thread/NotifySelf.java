package com.kode.test.thread;

/**
 * Created by zhongcy on 2016/9/22.
 */
public class NotifySelf {

    public static void main(String[] args) throws InterruptedException {
        WaitThread wt = new WaitThread();
        wt.start();
        Thread.sleep(1000);
        wt.notifyself();
    }


}

class WaitThread extends Thread {

    private Object lock = new Object();

    public void run() {
        synchronized (lock) {
            System.out.println("线程开始等待");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程被唤醒");
        }
    }

    public void notifyself() {
        synchronized (lock) {
            lock.notify();
        }
    }

    public Object getLock() {
        return lock;
    }

}