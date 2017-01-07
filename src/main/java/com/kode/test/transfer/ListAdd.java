package com.kode.test.transfer;

import com.google.common.base.MoreObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhongcy on 2016/12/15.
 */
class Person {
    int age;
    String name;

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
                .add("age", age)
                .add("name", name)
                .toString();
    }
}

public class ListAdd {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(1);
        List<Person> list = new ArrayList<>();
        list.add(person);
        person.setName("11");
        System.out.println(list);
    }
}
