package com.kode.test.test;

/**
 * classLoader一共分为三种：
 * BootStrap ClassLoader
 * Extension ClassLoader
 * AppClassLoader
 * 先从父类开始加载，只有被同一个类加载器实例加载并且文件名相同的class文件才被认为是同一个class.
 * Created by zhongcy on 2016/7/7.
 */
public class ClassLoaderTest {

    @org.junit.Test
    public void test() {
        ClassLoader classLoader = Test.class.getClassLoader();
        System.out.println(classLoader.toString());
        System.out.println(classLoader.getParent().toString());
        System.out.println(classLoader.getParent().getParent().toString());
    }

}
