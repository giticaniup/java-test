package com.kode.test.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BufferedReaderDemo
 * 字符流
 * Created by zhongcy on 2017-03-15.
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char c;
        while ((c = (char) bufferedReader.read()) != -1) {
            System.out.print(c);
        }
    }
}
