package com.kode.test.proxy;

/**
 * Created by zhongcy on 2016/3/22.
 */
public class Test {
    public static void main(String[] args) {
        StudentProxy proxy=new StudentProxy();
        Person person= (Person) proxy.newInstance(new Student());
        person.speak();
    }
}
