package com.kode.test.thread;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhongcy on 2016/9/23.
 */
public class FutureDemo {
    @Test
    public void test() throws ExecutionException, InterruptedException {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 10; i++) {
            int finalI = i;
//            System.out.println("线程构造："+i);
            Future<Integer> future = ThreadUtils.EXECUTOR_SERVICE.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    System.out.println(Thread.currentThread().getName() + ":" + finalI);
                    TimeUnit.MILLISECONDS.sleep(500);
                    list.add(finalI);
                    return 1;
                }
            });
        }
        System.out.println(list);
    }
}
