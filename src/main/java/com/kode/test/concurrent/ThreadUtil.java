package com.kode.test.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhongcy on 2017/1/4.
 */
public class ThreadUtil {
    public static final ExecutorService THREAD_POOL = Executors.newFixedThreadPool(10);
}
