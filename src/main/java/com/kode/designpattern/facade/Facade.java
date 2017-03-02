package com.kode.designpattern.facade;

/**
 * Created by zhongcy on 2017-03-02.
 */
public class Facade {
    private ClassA classA = new ClassA();

    private ClassB classB = new ClassB();

    public void method1(){
        this.classA.method();
    }

    public void method2(){
        this.classB.method();
    }
}
