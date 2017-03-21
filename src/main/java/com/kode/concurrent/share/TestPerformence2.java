package com.kode.concurrent.share;

import org.apache.commons.lang.time.StopWatch;
import org.junit.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock和Synchronized的性能比较
 * 在没有锁竞争的情况下，JVM会对synchronized做优化
 * Created by zhongcy on 2017-03-07.
 */
public class TestPerformence2 {
    final int LOOP = 100;
    int sum = 0;
    private Lock lock = new ReentrantLock();

    private int sumByLock() {
        lock.lock();
        try {
            sum++;
        } finally {
            lock.unlock();
        }
        return sum;
    }

    private int sumBySync() {
        synchronized (this) {
            return sum++;
        }
    }

    @Test
    public void testLock() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Thread[] threads = new Thread[LOOP];
        for (int i = 0; i < LOOP; i++) {
            threads[i] = new Thread(this::sumByLock);
            threads[i].start();
        }
        for (int i = 0; i < LOOP; i++) {
            threads[i].join();
        }
        System.out.println(sum);
        stopWatch.stop();
        System.out.println(stopWatch.getTime());
    }

    @Test
    public void testSynchronized() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Thread[] threads = new Thread[LOOP];
        for (int i = 0; i < LOOP; i++) {
            threads[i] = new Thread(this::sumBySync);
            threads[i].start();
        }
        for (int i = 0; i < LOOP; i++) {
            threads[i].join();
        }
        System.out.println(sum);
        stopWatch.stop();
        System.out.println(stopWatch.getTime());
    }
}
