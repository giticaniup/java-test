package com.kode.test.effectivejava;

/**
 * 复杂对象的Main方法
 * Created by zhongcy on 2017-03-17.
 */
public class ComplexMain {
    public static void main(String[] args) {
        ComplexPerson complexPerson = new ComplexPerson.Builder("zhongcy",1).age(24).build();
        System.out.println(complexPerson);
    }
}
