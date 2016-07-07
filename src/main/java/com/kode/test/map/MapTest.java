package com.kode.test.map;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Map测试
 * 1.Iterator快速失败
 * Created by zhongcy on 2016/7/7.
 */
public class MapTest {
    @Test
    public void test(){
        Map<String,Integer> sycMap = Collections.synchronizedMap(new HashMap<>());
        Map<String,Integer> map = new HashMap<>();
        sycMap.put("s1",1);
        map.put("one",1);
        map.put("two",2);
        Iterator iterator = map.keySet().iterator();
        map.put("three",3);//抛出java.util.ConcurrentModificationException
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
