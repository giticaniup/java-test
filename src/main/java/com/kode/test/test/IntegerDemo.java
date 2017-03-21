package com.kode.test.test;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhongcy on 2017/1/5.
 */
public class IntegerDemo {
    @Test
    public void test() {
        System.out.println(Integer.getInteger(null));
        List list = Collections.singletonList(null);
        System.out.println(list);
        System.out.println(LocalDateTime.now());
    }
}
