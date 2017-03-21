package com.kode.test.collections;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * 优先级队列
 * 适用场景，如在线程优先级队列中，加入的顺序是乱序的，但是取出的应该是优先级最高的
 * Created by zhongcy on 2017/1/4.
 */
public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(LocalDate.of(2003, 1, 1));
        priorityQueue.add(LocalDate.of(2001, 1, 1));
        priorityQueue.add(LocalDate.of(2004, 1, 1));
        priorityQueue.add(LocalDate.of(2002, 1, 1));

        priorityQueue.forEach(System.out::println);
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }
}
