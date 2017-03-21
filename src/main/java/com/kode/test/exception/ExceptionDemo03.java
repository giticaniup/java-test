package com.kode.test.exception;

/**
 * Created by zhongcy on 2016/11/14.
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new RuntimeException();
        }
        System.out.println(11);
    }
}
