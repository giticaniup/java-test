package com.kode.test.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhongcy on 2016/9/22.
 */
public class WatiDemo {

    public static void main(String[] args) {
        WatiDemo demo = new WatiDemo();
        demo.todoFunction();
    }

    public  void todoFunction(){
        synchronized (this) {
            System.out.println("主线程执行");
            try {
                test();
                System.out.println("主线程wait");
                wait();
                System.out.println("主线程继续");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void test() throws InterruptedException {

        for (int j = 0; j < 1; j++) {
            ThreadUtils.EXECUTOR_SERVICE.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
/*                    if(i[0]==3) try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
//                    }*/
//                    System.out.println("线程执行,i="+i[0]);
//                    try {
//                        if(i[0]/2!=0){
//                            wait();
//                            System.out.println("I am wait");
//                        }else {
//                            System.out.println("I am notify");
////                            notify();
//                        }
//                        TimeUnit.SECONDS.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                   notifyAll();
                    System.out.println("test2已经执行");
                }
            });
        }
        ThreadUtils.EXECUTOR_SERVICE.shutdown();

    }
}
