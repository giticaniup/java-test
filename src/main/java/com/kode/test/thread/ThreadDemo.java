//package com.kode.test.thread;
//
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//
//public class ThreadDemo {
//    public static void main(String[] args) {
//        ExecutorService executor = Executors.newCachedThreadPool();
//        Task task = new Task();
//        Future<Integer> result = executor.submit(task);
//        executor.shutdown();
//
////        try {
////            Thread.sleep(1000);
////        } catch (InterruptedException e1) {
////            e1.printStackTrace();
////        }
//
//        System.out.println("主线程在执行任务");
//
//        try {
//            System.out.println("task运行结果" + result.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("所有任务执行完毕");
//    }
//}
//
//class Task implements Callable<Integer> {
//    @Override
//    public Integer call() throws Exception {
//        System.out.println("子线程在进行计算");
//        Thread.sleep(3000);
//        int sum = 0;
//        for (int i = 0; i < 100; i++)
//            sum += i;
//        return sum;
//    }
//
//    ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize,
//            KEEP_ALIVE_TIME, UNIT, new ArrayBlockingQueue<Runnable>(
//            queueSize));
//    Future<String> future = executor.submit(new Callable<String>() {
//        public String call() {
//            try {
//                ……
//            } catch (Exception e) {
//                //捕捉到异常时进行异常处理并返回failed
//                return  “failed”;
//            }
//            //业务处理正常则返回success
//            String result = "failed";
//            try {
//                //通过回调获取线程执行是否出现异常
//                result = future.get();
//            } catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//            return result;
//        }
//    });
//}