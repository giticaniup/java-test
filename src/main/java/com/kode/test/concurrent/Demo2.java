package com.kode.test.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Future中抛出异常如何返回？
 * 返回执行过程中的异常信息
 * Created by zhongcy on 2017/1/4.
 */
public class Demo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<String> future = ThreadUtil.THREAD_POOL.submit(() -> {
            throw new RuntimeException();
        });
        ThreadUtil.THREAD_POOL.shutdown();
        if(future.get().getClass().equals(ExecutionException.class)){
//            System.out.println("exception");
        }
    }
}
