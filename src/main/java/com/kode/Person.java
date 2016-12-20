package com.kode;

import com.google.common.base.MoreObjects;

/**
 * 测试类
 * Created by zhongcy on 2016/12/19.
 */
public class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("age", age)
                .toString();
    }

    Person(int age){
        this.age = age;
    }

    Person(){

    }
}
