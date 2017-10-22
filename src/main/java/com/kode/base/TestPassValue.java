package com.kode.base;

/**
 * Created by zhongchengyong on 2017/10/22.
 */
class Person{
    int a;
    String s;

    @Override
    public String toString() {
        return "Person{" +
                "a=" + a +
                ", s='" + s + '\'' +
                '}';
    }
}
public class TestPassValue {
    public static void main(String[] args) {
        Person p = new Person();
        change(p);
        System.out.println(p);
    }

    private static void change(Person p) {
        p.a = 1;
        p.s = "1";
        Person p2 = new Person();
        p2.a = 2;
        p = p2;
    }
}
