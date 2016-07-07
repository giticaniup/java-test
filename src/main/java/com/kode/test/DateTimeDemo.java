package com.kode.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by zhongcy on 2016/4/6.
 */
public class DateTimeDemo {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime= LocalDateTime.parse("2016-04-12 12:12",dtf);
        LocalDateTime localNow=LocalDateTime.now();
        //LocalDateTime iosDate=LocalDateTime.parse("201604041212",DateTimeFormatter.BASIC_ISO_DATE );
        System.out.println(dateTime);
        //System.out.println(iosDate);
        Instant instant=localNow.toInstant(ZoneOffset.UTC);
        Long tLong=Date.from(instant).getTime();
        System.out.println(tLong);
        Instant timestamp=Instant.now();
        long tp=Date.from(timestamp).getTime();
        long currenttp=System.currentTimeMillis();
        System.out.println("当前时间戳为："+timestamp);
        System.out.println("当前时间戳为："+tp);
        System.out.println("当前时间戳为："+currenttp);

        LocalDateTime now=LocalDateTime.now();
        System.out.println("当前时间："+now);
        String formatStr=dtf.format(now);
        System.out.println("格式化当前时间"+formatStr);



    }
}
