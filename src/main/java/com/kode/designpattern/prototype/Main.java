package com.kode.designpattern.prototype;

/**
 * 原型模式
 * 用原型指定创建对象的种类，通过拷贝这些原型创建新的对象
 * 其中，原型中可以包含一些类似的属性
 * 性能要比new对象快，特别是在循环中；在内存中拷贝，不调用构造函数
 * Object类提供的方法clone只是拷贝本对象， 其对象内部的数组、 引用对象等都不拷贝， 还是指向原生对象的内部元素地址， 这种拷贝就叫做浅拷贝
 * String/String[]会拷贝，但是引用类型不拷贝
 * Created by zhongcy on 2017-03-01.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail("Subject");
        for (int i = 0; i < 10; i++) {
            Mail newMail = mail.clone();
            newMail.setMailContext("Context" + i);
            System.out.println(newMail);
        }
    }
}
