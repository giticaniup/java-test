package com.kode.test.exception;

import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/**
 * lambda表达式中，异常需要自行处理
 * Created by zhongcy on 2016/8/8.
 */
public class ExceptionDemo02 {
    static ExceptionDemo01 exceptionDemo01 = new ExceptionDemo01();

    private static void invoke() throws SocketException {
        List<String> list = new ArrayList<>();
        list.add("a");

        for (String s : list) {
            System.out.println(s);
            exceptionDemo01.getIp();
        }
/*        list.forEach(s -> {
            exceptionDemo01.getIp();
            System.out.println(s);
        });*/

        exceptionDemo01.getIp();
    }

    public static void main(String[] args) throws SocketException {
        invoke();
    }
}
