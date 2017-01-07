//package com.kode.test.thread;
//
///**
// * Created by zhongcy on 2016/9/22.
// */
//public class TestWaitNotify {
//
//    public static void main(String[] args) {
//        WaitThread wt = new WaitThread();
//        wt.start();
//        new NotifyThread(new Object()).start();
//    }
//
//
//}
//class WaitThread extends Thread {
//
//    private Object lock = new Object();
//
//    public void run() {
//        synchronized(lock) {
//            System.out.println("线程开始等待");
//            try {
//                lock.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("线程被唤醒");
//        }
//    }
//
//    public void notifyself() {
//        synchronized(lock) {
//            lock.notify();
//        }
//    }
//
//    public Object getLock() {
//        return lock;
//    }
//
//}
//
//class NotifyThread extends Thread {
//
//    private Object lock;
//
//    public NotifyThread(Object lock) {
//        this.lock = lock;
//    }
//
//    public void run() {
//        synchronized(lock) {
//            lock.notify();
//        }
//    }
//
//}
