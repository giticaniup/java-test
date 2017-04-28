package com.kode.test.test;

import java.io.File;
import java.io.IOException;

public class FileDemo {
     public static void main(String[] args) throws IOException {
         //构造函数File(String pathname)
         File f1 =new File("c:\\1.txt");
         //File(String parent,String child)
         File f2 =new File("c:\\abc","2.txt");
         //File(File parent,String child)
         File f3 =new File("c:"+File.separator+"abc");//separator 跨平台分隔符
         File f4 =new File(f3,"3.txt");
         System.out.println(f1);//c:\abc\1.txt
         System.out.println(f1.createNewFile());
     }

 }