package com.kode.jdk9;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * jdk9中新的集合接口
 * Created by zhongchengyong on 2017/9/24.
 */
public class CollectionFactory {

    /**
     * Of接口的使用
     */
    @Test
    public void testCollectionFactory(){
        Set set  = Set.of("1","2");
        System.out.println(set);

        List<String> strList = List.of("java8","java9");
        System.out.println(strList);
    }

    /**
     * Stream的使用
     */
    @Test
    public void testStream(){
        IntStream.iterate(1,i->i<100,i->i+1).forEach(System.out::println);
        Stream<Integer> s = Optional.of(1).stream();
        s.forEach(System.out::println);
    }

    /**
     * Process接口的使用
     */
    @Test
    public void testProcessAPI(){
        Stream<ProcessHandle> processStream = ProcessHandle.allProcesses();
        processStream.forEach(System.out::println);
    }

}
