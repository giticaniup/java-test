package com.kode.base;

/**
 * 先执行static块
 */
class Cat {
    String name;
    int age;

    //使用构造器初始化name，age两个实例变量
    public Cat(String name, int age) {
        System.out.println("执行构造器");
        this.name = name;
        this.age = age;
    }

    {
        System.out.println("执行非静态初始化块");
        weight = 2.0;
    }

    //定义时指定初始值
    double weight = 2.3;
    int height;

    public String toString() {
        return "Cat[name=" + name + ",age=" + age + ",weight=" + weight + ",height=" + height + "]";
    }
}

public class InitTest {
    public static void main(String[] args) {
        Cat cat = new Cat("kitty", 2);
        System.out.println(cat);
    }
} 