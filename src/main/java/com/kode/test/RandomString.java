package com.kode.test;

import java.util.Random;
import java.util.UUID;

/**
 * Created by zhongcy on 2016/12/22.
 */
public class RandomString {

    public UUID byUUid() {
        return UUID.randomUUID();
    }

    public String byRandom() {
        StringBuilder sb = new StringBuilder("");

        Random random = new Random();
        for (int i = 0; i < 32; i++) {
            sb.append(random.nextInt(9));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RandomString r = new RandomString();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            r.byUUid();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);

        begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            r.byRandom();
        }
        end = System.currentTimeMillis();
        System.out.println(end - begin);

    }
}
