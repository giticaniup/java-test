package com.kode.concurrent.share;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * 基本类型实现CAS
 */
public class AtomicIntegerFieldUpdaterDemo {
    private static class V {
        volatile int score;

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

    }

    //使用AtomicInteger来比较两个值的结果，如果相等则说明线程安全
    private final static AtomicIntegerFieldUpdater<V> vv = AtomicIntegerFieldUpdater.newUpdater(V.class, "score");

    private static AtomicInteger allscore = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        final V stu = new V();
        Thread[] t = new Thread[10];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread() {
                @Override
                public void run() {
                    if (Math.random() > 0.4) {
                        vv.incrementAndGet(stu);
                        allscore.incrementAndGet();
                    }
                }
            };
            t[i].start();
        }

        for (int i = 0; i < t.length; i++) {
            t[i].join();
        }
        System.out.println("score=" + stu.getScore());
        System.out.println("allscore=" + allscore);
    }
}