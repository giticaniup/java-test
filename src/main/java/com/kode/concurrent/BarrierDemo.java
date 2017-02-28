package com.kode.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 栅栏Demo
 * 设置一个屏障，等待所有的线程到达后开始运行
 * 每个await()方法使barrier -1
 * CyclicBarrier是可重入的
 * Created by zhongcy on 2017-02-27.
 */
public class BarrierDemo {

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        //四个屏障，三个选手，一个裁判
        CyclicBarrier barrier = new CyclicBarrier(4);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(new Runner(barrier, 1));
        executor.submit(new Runner(barrier, 2));
        executor.submit(new Runner(barrier, 3));
        barrier.await();
        System.out.println("裁判鸣枪");
        executor.shutdown();
    }

    static class Runner implements Runnable {
        private CyclicBarrier barrier;
        private int num;

        public Runner(CyclicBarrier barrier, int num) {
            this.barrier = barrier;
            this.num = num;
        }

        @Override
        public void run() {
            System.out.println(num + "选手准备");
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println(num + "选手起跑");
        }
    }

}
