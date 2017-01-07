package com.kode.test.thread;

import java.util.concurrent.TimeUnit;

/**
 * 私有锁的访问情况与内置锁相同
 * 即：访问对象的加锁方法，必须获得似有锁
 * Created by zhongcy on 2016/12/19.
 */

class PrivateLock {
    private int i;
    private Object myLock = new Object();

    public synchronized int get() {
        return i;
    }

    public void increase() throws InterruptedException {
        synchronized (myLock) {
            TimeUnit.SECONDS.sleep(1);
            i++;
        }
    }

    public void multipile() {
        synchronized (myLock) {
            i = i * 3;
        }
    }

    public void err() {
        i = 10;
    }
}

class IncThread extends Thread {
    PrivateLock pl;

    IncThread(PrivateLock p) {
        this.pl = p;
    }

    @Override
    public void run() {
        System.out.println("enter increase");
        try {
            pl.increase();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(pl.get());
    }
}

class MulThread extends Thread {
    PrivateLock pl;

    MulThread(PrivateLock p) {
        this.pl = p;
    }

    @Override
    public void run() {
        System.out.println("enter multiple");
        pl.err();
        System.out.println(pl.get());
    }
}


public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        PrivateLock pl = new PrivateLock();
        new IncThread(pl).start();
        TimeUnit.SECONDS.sleep(1);
        new MulThread((pl)).start();
    }
}


