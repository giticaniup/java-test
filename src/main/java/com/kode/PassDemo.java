package com.kode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhongcy on 2016/12/9.
 */
public class PassDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);
        change(list);
        System.out.println(list);
    }

    public static void change(List list2) {
        list2.add(1);
    }

    @Test
    public void test() {
        String s = "1";
        String s1 = s;
        s1 = "2";
        System.out.println("s:" + s);
        System.out.println("s1:" + s1);
    }

    @Test
    public void testObj() {
        Person person = new Person(1);
        Person p1 = person;
        p1.setName("tom");
        System.out.println(person);
        System.out.println(p1);
        ageIncrease(p1);
        System.out.println(person);
        System.out.println(p1);
    }

    public void ageIncrease(Person person) {
        person.age++;
    }
}


