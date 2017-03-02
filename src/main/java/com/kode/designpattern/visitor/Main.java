package com.kode.designpattern.visitor;

/**
 * 访问者模式
 * 封装各种操作，在不改变数据结构的前提下定义新的操作
 * 加入现在要统计公司所有人的工资，如果不采用访问者模式，那么需要每次都去循环判断是什么对象
 * 使用访问者模式可以使用accept()来解决
 * 缺点：访问者visitor依赖了具体的实现类，不便于扩展
 * Created by zhongcy on 2017-03-02.
 */
public class Main {
    public static void main(String[] args) {
        Element c1 = new ConcreteElement1();
        IVisitor visitor = new Visitor();
        c1.accept(visitor);
    }
}
