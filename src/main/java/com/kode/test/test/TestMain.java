package com.kode.test.test;

import org.junit.Test;

/**
 * Created by zhongcy on 2016/9/23.
 */
public class TestMain {
    public static final int CPU_NUM = Runtime.getRuntime().availableProcessors();

    @Test
    public void test() {
        System.out.println(CPU_NUM);
    }
}
