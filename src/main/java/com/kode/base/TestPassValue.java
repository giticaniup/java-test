package com.kode.base;

/**
 * 测试值传递和引用传递的问题。
 * 当参数是引用类型的时候，将地址赋值给当前变量(指针)
 * 当修改当前变量的值的时候，影响值的变更。重新赋值时，当前指针指向其他内存地址，不会修改原有的值。
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
