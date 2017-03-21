package com.kode.concurrent;

/**
 * 多线程运行不能按照顺序执行过程中捕获异常的方式来处理异常，异常会被直接抛出到控制台
 * Created by zhongcy on 2017/1/11.
 */
class ThreadTask extends Thread {
    public void run() {
        throw new NullPointerException();
    }
}

public class ThreadException {
    public static void main(String[] args) {
        ThreadTask tt = new ThreadTask();
        try {
            tt.start();
        } catch (NullPointerException e) {
            System.out.println("here is a exception");
        }
    }
}
