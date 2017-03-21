package com.kode.test.test;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * Created by zhongcy on 2017/1/6.
 */
public class TimeStampDemo1 {
    public static void main(String[] args) {
        LocalDateTime will = LocalDateTime.of(2099, 12, 31, 0, 0);
        will.toInstant(ZoneOffset.UTC).toEpochMilli();
        System.out.println(will.toInstant(ZoneOffset.UTC).toEpochMilli());

        will = LocalDateTime.of(2017, 1, 1, 17, 37);
        System.out.println(will.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println(System.currentTimeMillis());
    }
}
