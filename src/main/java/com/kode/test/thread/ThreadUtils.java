package com.kode.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhongcy on 2016/9/22.
 */
public class ThreadUtils {
    public static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(2);
}
