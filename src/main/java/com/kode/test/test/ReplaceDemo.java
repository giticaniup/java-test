package com.kode.test.test;

import java.io.File;

/**
 * Replace和ReplaceAll
 * replace更换所有，参数是char
 * replaceAll更换所有，使用的是正则表达式
 * Created by zhongcy on 2017-03-15.
 */
public class ReplaceDemo {
    public static void main(String[] args) {
        String str = "Hello World I am \\Zhongcy";
        System.out.println(str.replace(' ','_'));
        System.out.println(str.replace(" ","_"));
        //在正则中，需要用\\\\来代表\，因为\\代表\，正则又是用\\代表\
        System.out.println(str.replaceAll("\\\\","\\\\\\\\"));
        //返回char
        System.out.println(File.separatorChar);
        //返回String
        System.out.println(File.separator);
    }
}
