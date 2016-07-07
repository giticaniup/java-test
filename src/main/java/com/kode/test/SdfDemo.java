package com.kode.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhongcy on 2016/6/17.
 */
public class SdfDemo {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private static final String dateStr = "2013-01-12";

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Runnable r = () -> {

                try {
                    String str2;
                    synchronized (sdf) {
                        Date date = sdf.parse(dateStr);
                        str2 = sdf.format(date);
                    }
                    if (!dateStr.equals(str2)) {
                        throw new RuntimeException("not safe");
                    }
                    System.out.println("true");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            };
            new Thread(r).start();
        }
    }
}
