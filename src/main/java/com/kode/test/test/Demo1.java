package com.kode.test.test;

import com.google.common.base.Joiner;
import com.google.gson.Gson;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by zhongcy on 2017/1/9.
 */
public class Demo1 {
    @Test
    public void testDemo() {
        Double d = 1.1;
        System.out.println(d);
    }

    @Test
    public void testDemo2() {
        List<String> list = Arrays.asList("1", "2");
        System.out.println(list);
        ListIterator listIterator = list.listIterator(2);
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() instanceof String);
            System.out.println(listIterator.previous());
        }
    }

    @Test
    public void testString() {
        System.out.println("1");
        System.out.println("1".intern() == "1");
        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(new Gson().toJson(new Date()));
        System.out.println(localDate);
        System.out.println(new Gson().toJson(localDate));
    }

    @Test
    public void testDate() {
        long time = System.currentTimeMillis();
        System.out.println(new Date(time));
    }

    @Test
    public void testNull() {
        String s = "12122.1221.12";
        System.out.println(Arrays.toString(s.split(".")));
    }

    @Test
    public void testIntegerNull() {
        Integer i = 1;
//        System.out.println(String.valueOf(i));
        System.out.println((++i));
        Joiner.on("").join("",null);
    }

    @Test
    public void testException(){
        try{
            int i=1/0;
        }catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        }
    }

    @Test
    public void testDouble(){
        double a = 1.1;
        double b = 0.1;
        System.out.println(a+b);
    }

}
