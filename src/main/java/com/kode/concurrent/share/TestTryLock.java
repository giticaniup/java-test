package com.kode.concurrent.share;

import org.junit.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * tryLock()测试，如果不能获得锁，立即返回false
 * tryLock()提供可轮询的锁
 * tryLock(long,TimeUnit)提供可定时的锁
 * Created by zhongcy on 2017-03-07.
 */
public class TestTryLock {
    public Lock lock = new ReentrantLock();
    private int money = 100;

    public void debit(int money) {
        this.money += money;
    }

    public void credit(int money) {
        this.money -= money;
    }

    public static void transfer(TestTryLock debitTestTryLock, TestTryLock creditTestTryLock, int money) {
        while (true) {
            if (debitTestTryLock.lock.tryLock()) {
                try {
                    if (creditTestTryLock.lock.tryLock()) {
                        try {
                            debitTestTryLock.debit(money);
                            creditTestTryLock.credit(money);
                            return;
                        } finally {
                            creditTestTryLock.lock.unlock();
                        }
                    }
                } finally {
                    debitTestTryLock.lock.unlock();
                }
            }
        }
    }


    @Test
    public void test() throws InterruptedException {
        TestTryLock fromAccount = new TestTryLock();
        TestTryLock toAccount = new TestTryLock();
        new Thread(() -> {
            transfer(fromAccount,toAccount,100);
        }).start();
        new Thread(() -> {
            transfer(toAccount,fromAccount,10);
        }).start();
        Thread.sleep(1000);
        System.out.println(fromAccount.money);
        System.out.println(toAccount.money);
    }
}


