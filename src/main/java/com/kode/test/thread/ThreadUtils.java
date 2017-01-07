package com.kode.test.thread;

        import java.util.concurrent.Executor;
        import java.util.concurrent.ExecutorService;
        import java.util.concurrent.Executors;
        import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by zhongcy on 2016/9/22.
 */
public class ThreadUtils {
    public static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(2);
}
