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
public class TestPerformence {
    final int LOOP = 1000000;
    int sum = 0;

    @Test
    public void testLock() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Lock lock = new ReentrantLock();
        for (int i = 0; i <= LOOP; i++) {
            lock.lock();
            try {
                sum += i;
            } finally {
                lock.unlock();
            }
        }
        System.out.println(stopWatch.getTime());
        stopWatch.stop();
    }

    @Test
    public void testSynchronized() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        synchronized (this) {
            for (int i = 0; i <= LOOP; i++) {
                sum += i;
            }
        }
        System.out.println(stopWatch.getTime());
        stopWatch.stop();
    }
}
