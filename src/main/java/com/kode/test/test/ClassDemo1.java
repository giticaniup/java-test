package com.kode.test.test;

import com.kode.Person;

import java.util.ArrayList;

/**
 * Created by zhongcy on 2016/12/29.
 */
public class ClassDemo1 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getClass());
        System.out.println(Person.class);

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.getClass());
        System.out.println(ArrayList.class);
        System.out.println(list.getClass()== ArrayList.class);
    }
}
