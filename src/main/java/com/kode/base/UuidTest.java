package com.kode.base;

import org.junit.Test;

import java.util.UUID;

/**
 * 128位的随机串
 * 由mac地址+时间
 * Created by zhongchengyong on 2017/4/23.
 */
public class UuidTest {
    @Test
    public void testUuid() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(UUID.randomUUID().toString());
            Thread.sleep(1000);
        }
    }
}
