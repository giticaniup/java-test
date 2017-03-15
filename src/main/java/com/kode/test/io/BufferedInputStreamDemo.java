package com.kode.test.io;

import java.io.BufferedInputStream;
import java.io.IOException;

/**
 * BufferedInputStreamDemo
 * 字节流
 * Created by zhongcy on 2017-03-15.
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
        char c;
        while ((c= (char) bufferedInputStream.read())!=-1){
            System.out.print(c);
        }
    }
}
