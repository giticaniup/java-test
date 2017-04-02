package com.kode.book.javainterview;


import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是书上的一道题：被3整除替换为fizz，被5整除替换为buzz，被15整除替换为fizzbuzz
 * 主要记录的是代码结构
 * 这种情况下需要将循环判断抽离出来形成独立的方法，便于扩展
 * Created by zhongchengyong on 2017/4/2.
 */
public class FizzBuzz {

    //实现方法1
    private List<String> fizzBuzz1(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("fizzbuzz");
            } else if (i % 5 == 0) {
                result.add("buzz");
            } else if (i % 3 == 0) {
                result.add("fizz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    private List<String> fizzBuzz2(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String word = toWord(i, 3, "fizz") + toWord(i, 5, "buzz");
            if (StringUtils.isEmpty(word)) {
                word = String.valueOf(i);
            }
            result.add(word);
        }
        return result;
    }

    private String toWord(int i, int i1, String buzz) {
        return i % i1 == 0 ? buzz : "";
    }


    @Test
    public void testFizzBuzz() {
        List<String> result = fizzBuzz2(10);
        System.out.println(result);
        Assert.assertSame(result.size(), 10);
    }

}
