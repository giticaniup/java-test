package com.kode.test.concurrency;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * 线程池的取消
 * Created by zhongcy on 2017/1/18.
 */
public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        Future future = ThreadPoolUtil.GET_FSUSER.submit(new Runnable() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    System.out.println("InterruptedException");
//                }
                System.out.println(Thread.currentThread().getName());
            }
        });
//        future.cancel(true);
//        System.out.println(future.get(1000, TimeUnit.SECONDS));
        System.out.println("over");
    }
}
