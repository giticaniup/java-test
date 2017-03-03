package com.kode.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * JDK8 Predicate使用
 * Created by zhongcy on 2017-03-03.
 */
public class PredicateDemo {
    private static <T> List<T> select(List<T> list, Predicate<T> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = select(list, integer -> integer > 2);
        System.out.println(result);
    }
}
