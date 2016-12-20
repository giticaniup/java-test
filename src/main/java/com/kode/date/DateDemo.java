package com.kode.date;

import com.kode.Compute;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * 转为date.toString()后的字符串为Date类型
 * Created by zhongcy on 2016/12/16.
 */
public class DateDemo {
    public static void main(String[] args) {
        String str = "Mon Dec 31 00:00:00 CST 2012";
//        Date now=new Date();
        Date date = parse(str, "EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
//        String str2=format(now, "EEE MMM dd HH:mm:ss zzz yyyy", Locale.CHINA);
        System.out.printf("%tF %<tT%n", date);
//        System.out.println(str2);
        Compute compute = cal();
        compute.compute();
    }
    //形如Mon Dec 31 00:00:00 CST 2012字符串转换为相应日期Date
    public static Date parse(String str, String pattern, Locale locale) {
        if(str == null || pattern == null) {
            return null;
        }
        try {
            return new SimpleDateFormat(pattern, locale).parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    //
    public static String format(Date date, String pattern, Locale locale) {
        if(date == null || pattern == null) {
            return null;
        }
        return new SimpleDateFormat(pattern, locale).format(date);
    }

    public static Runnable run(){
        return new Runnable() {
            @Override
            public void run() {

            }
        };
    }

    public static Compute cal(){
        return new Compute() {
            @Override
            public void compute() {
                System.out.println("I am computing");
            }
        };
    }
}
