package com.kode.test.file;

import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by zhongcy on 2016/7/4.
 */
public class RandomFileTest {

    @Test
    public void testRandomFile() {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("C:/file/1.txt", "rw");
            int result;
            while ((result = randomAccessFile.read()) != -1) {
                System.out.println((char) result);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testRandomWrite() throws Exception {
        RandomAccessFile randomAccessFile = new RandomAccessFile("C:/file/1.txt", "rw");
        randomAccessFile.write("hello".getBytes(), 0, "hello".getBytes().length);
        randomAccessFile.close();
    }
}
