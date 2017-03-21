package com.kode.concurrent;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 通过BlockingQueue来实现生产者、消费者
 * Created by zhongcy on 2017/2/6.
 */
public class BlockingQueueDemo {
    public static void main(String[] args) {
        Plate plate = new Plate();
        Plate.AddThread addThread = new Plate.AddThread(plate);
        Plate.TakeThread takeThread = new Plate.TakeThread(plate);

        for (int i = 0; i < 10; i++) {
            new Thread(addThread).start();
        }
        for (int i = 0; i < 10; i++) {
            new Thread(takeThread).start();
        }
    }

}

class Plate {
    private ArrayBlockingQueue<Object> eggs = new ArrayBlockingQueue<Object>(5);

    public void addEgg(Object egg) {
        try {
            eggs.put(egg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("放入鸡蛋");
    }

    public Object takeEgg() {
        Object egg = null;
        try {
            egg = eggs.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("取出鸡蛋");
        return egg;
    }

    static class AddThread extends Thread {
        private Plate plate;

        AddThread(Plate plate) {
            this.plate = plate;
        }

        @Override
        public void run() {
            plate.addEgg(new Object());
        }
    }

    static class TakeThread extends Thread {
        private Plate plate;

        TakeThread(Plate plate) {
            this.plate = plate;
        }

        @Override
        public void run() {
            plate.takeEgg();
        }
    }
}
