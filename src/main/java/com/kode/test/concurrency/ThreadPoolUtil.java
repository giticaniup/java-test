package com.kode.test.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * 线程池工具类
 * Created by zhongcy on 2016/9/22.
 */
public class ThreadPoolUtil {

    // CPU的核数
    public static final int CPU_NUM = Runtime.getRuntime().availableProcessors();

    public static final ExecutorService GET_FSUSER = Executors.newFixedThreadPool(CPU_NUM * 2 + 1, new
            CommonThreadFactory("GET_FSUSER"));

    public static class CommonThreadFactory implements ThreadFactory {
        private static long index = 0;

        final String prefix;

        public CommonThreadFactory(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, prefix + (index++));
        }
    }

}