package com.kode.test.collections;

import com.kode.Person;
import com.kode.test.inter.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/**
 * 一些有用的方法
 * Created by zhongcy on 2017/1/4.
 */
public class CollectionDemo3 {
    List<String> list1;
    List<String> list2;
    Set<String> set;

    @Before
    public void setUp(){
        list1 = Arrays.asList("1","2");
        list2 = Collections.nCopies(10,"1");
        set = Collections.singleton("1");

    }

    /**
     * unmodifiableCollection方法返回的Collection，使用的是Object的hashCode方法，即使用==来判断
     */
    @Test
    public void testUnmodifyList(){
        List list3 = Collections.unmodifiableList(list1);
        List list4 = Collections.unmodifiableList(list1);
        System.out.println(list3==list4);
        System.out.println(list3.equals(list4));

        Collection coll1 = Collections.unmodifiableCollection(list1);
        Collection coll2 = Collections.unmodifiableCollection(list1);
        System.out.println(coll1==coll2);
        System.out.println(coll1.equals(coll2));
    }

    @Test
    public void testGeneric(){
        List<String> list1 = new ArrayList<>();

        List list2 = list1;
        list2.add(new Date());
        System.out.println(list1);
        List<String> list3 = Collections.checkedList(list1,String.class);
        //使用CheckedView生成的CheckedList，会在编译时校验泛型类的合法性
        //list3.add(new Date());
    }

    @Test
    public void testSort(){
        List<Person> list = new ArrayList<>();
        list.add(new Person(2));
        list.add(new Person(1));
        list.add(new Person(3));
//        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.comparing(Person::getAge));
        System.out.println(list);
    }

}
