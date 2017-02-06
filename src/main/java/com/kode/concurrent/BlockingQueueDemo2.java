package com.kode.concurrent;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by zhongcy on 2017/2/6.
 */
public class BlockingQueueDemo2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(5);
        blockingQueue.put("1");
        blockingQueue.put("2");
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    String s = blockingQueue.take();
                    System.out.println(s);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
