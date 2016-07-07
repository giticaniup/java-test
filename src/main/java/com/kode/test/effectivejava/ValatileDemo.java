package com.kode.test.effectivejava;

/**
 * Created by zhongcy on 2016/5/3.
 */
public class ValatileDemo {
    private static int count = 0;

    public static void increse() {
        count++;
    }

    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            new Thread(){
                @Override
                public void run(){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    increse();
                }
            }.start();
        }
        System.out.println(count);
    }
}
