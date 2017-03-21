package com.kode.test.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        ExecutorService executor = Executors.newCachedThreadPool();
        Task2 task = new Task2();
        Integer result1 = null;
        Future<Integer> result = executor.submit(task, result1);
        executor.shutdown();

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e1) {
//            e1.printStackTrace();
//        }

        System.out.println("主线程在执行任务");

        try {
            System.out.println("task运行结果" + result.get());
            System.out.println("等待执行结果？");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("所有任务执行完毕");
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("子线程在进行计算,runnable");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int sum = 0;
        for (int i = 0; i < 100; i++)
            sum += i;
    }
}