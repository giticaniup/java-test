package com.kode.test.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * Created by zhongcy on 2016/6/23.
 */
public class LocalDateTimeDemo {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime previous = localDateTime.minusDays(24);
        Instant instant = previous.toInstant(ZoneOffset.UTC);
        Date date = Date.from(instant);
        System.out.println(date);
    }
}
