package com.kode.concurrent.forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * Fork/join demo
 * fork:通过fork拆分一个个的子任务
 * join:通过join获取一个个子任务的结果并汇总
 * 通过fork方法加到pool的queue中，通过join()方法阻塞线程获取值
 * 使用场景：如大量报表数据的情况下使用
 * Created by zhongcy on 2017-03-20.
 */
class CountTask extends RecursiveTask<Integer> {
    private int start;
    private int end;

    CountTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        final int THRESHOLD = 2;
        int sum = 0;
        boolean canCompute = (end - start) < THRESHOLD;
        if (canCompute) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            int middle = (start + end) / 2;
            CountTask leftTask = new CountTask(start, middle);
            CountTask rightTask = new CountTask(middle + 1, end);
            leftTask.fork();
            rightTask.fork();
            int leftCount = leftTask.join();
            int rightCount = rightTask.join();
            sum = leftCount + rightCount;
        }
        return sum;
    }
}

public class ForkJoinDemo {
    public static void main(String[] args) {
        CountTask countTask = new CountTask(1, 10);
        System.out.println(countTask.compute());
    }
}
