package com.kode.test.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedFileReaderDemo
 * Created by zhongcy on 2017-03-15.
 */
public class BufferedFileReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\study\\java-test\\src\\main\\java\\com\\kode\\test\\io\\BufferedInputStreamDemo.java"));
        String s;
        try {
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        } finally {
            bufferedReader.close();
        }
    }
}
