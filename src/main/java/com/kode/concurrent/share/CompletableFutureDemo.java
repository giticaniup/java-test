package com.kode.concurrent.share;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * CompletableFuture
 * Created by zhongcy on 2017-03-09.
 */
public class CompletableFutureDemo {
    public static Integer calc(Integer para) {
        try {
            // 模拟一个长时间的执行
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return para * para;
    }

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        final CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> calc(50));
        System.out.println(future.get());
    }
}
