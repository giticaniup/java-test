package com.kode.test.file;

import java.io.File;
import java.io.FileReader;

/**
 * Created by zhongcy on 2016/7/4.
 */
public class FileReaderTest {
    public static void main(String[] args) throws Exception {
        File file = new File("c:/file/1.txt");
        FileReader fileReader = new FileReader(file);
        char[] c = new char[1024];
        while (fileReader.read(c) != -1) {
            System.out.println(c);
        }
//        int result;
//        while (( result=fileReader.read())!=-1){
//            System.out.println((char)result);
//        }
    }
}
