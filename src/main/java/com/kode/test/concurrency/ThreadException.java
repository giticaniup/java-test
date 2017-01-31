package com.kode.test.concurrency;

/**
 * 牢记！线程有异常，线程死亡。工作线程不能catch到异常，
 * 异常会传递到Thread.UncaughtExceptionHandler的类
 * Created by zhongcy on 2017/1/19.
 */
public class ThreadException {
    public static void main(String[] args) {
        ExceptionThread et = new ExceptionThread();
        et.setUncaughtExceptionHandler((t, e) -> System.out.println(t.getName()+e));
        try {
            et.start();
        }catch (Exception e){
            System.out.println("here");
            e.printStackTrace();
        }
    }
}
class ExceptionThread extends Thread{
    @Override
    public void run(){
        int i = 1/0;
    }

}
