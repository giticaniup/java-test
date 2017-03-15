package com.kode.vm;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 自定义ClassLoader的使用
 * 但是由于双亲加载机制，还是使用的父类加载器
 * Created by zhongcy on 2017-03-15.
 */
public class MyClassLoader extends ClassLoader {

    private String root;

    private void setRoot(String root) {
        this.root = root;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = null;
        try {
            bytes = loadClassData(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bytes != null) {
            defineClass(name, bytes, 0, bytes.length);
        }
        return null;
    }

    private byte[] loadClassData(String name) throws IOException {
        File file = new File(root + File.separatorChar + name.replace('.', File.separatorChar) + ".class");
        InputStream in = new FileInputStream(file);
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = in.read(buffer)) != -1) {
            bao.write(buffer, 0, length);
        }
        return bao.toByteArray();
    }

    public static void main(String[] args) {
        MyClassLoader classLoader = new MyClassLoader();
        classLoader.setRoot("D:\\study\\java-test\\src\\main\\java");
        Class<?> clazz;
        try {
            clazz = classLoader.loadClass("com.kode.test.StringTest");
            Object stringTest = clazz.newInstance();
            System.out.println(stringTest.getClass().getClassLoader());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() throws IOException {
        MyClassLoader classLoader = new MyClassLoader();
        classLoader.setRoot("D:\\study\\java-test\\src\\main\\java");
        classLoader.loadClassData("com.kode.test.StringTest");
    }
}
