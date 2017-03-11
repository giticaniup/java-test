package com.kode.concurrent.share;

import org.apache.commons.lang.time.StopWatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * LongAdder与AtomicLong
 * Created by zhongcy on 2017-03-09.
 */
public class LongAdderDemo {

    private LongAdder longAdder = new LongAdder();
    private AtomicLong atomicLong = new AtomicLong();
    private long l = 0L;

    private void addByAdder() {
        longAdder.increment();
    }

    private void addAtomicLong() {
        atomicLong.incrementAndGet();
    }

    private synchronized void add() {
        l++;
    }

    @org.junit.Test
    public void test1() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        CountDownLatch countDownLatch = new CountDownLatch(500);
        for (int i = 0; i < 500; i++) {
            new Thread(() -> {
                addByAdder();
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println("result:" + longAdder);
        System.out.println("time" + stopWatch.getTime());
        stopWatch.stop();
    }

    @org.junit.Test
    public void test2() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        CountDownLatch countDownLatch = new CountDownLatch(500);
        for (int i = 0; i < 500; i++) {
            new Thread(() -> {
                addAtomicLong();
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println("result:" + atomicLong);
        System.out.println("time:" + stopWatch.getTime());
        stopWatch.stop();
    }

    @org.junit.Test
    public void test3() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        CountDownLatch countDownLatch = new CountDownLatch(5000);
        for (int i = 0; i < 5000; i++) {
            new Thread(() -> {
                add();
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println("result:" + l);
        System.out.println("time:" + stopWatch.getTime());
        stopWatch.stop();
    }
}
