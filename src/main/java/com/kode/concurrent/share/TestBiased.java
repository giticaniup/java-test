package com.kode.concurrent.share;

import java.util.List;
import java.util.Vector;

/**
 * 偏向锁性能测试
 * 一般在无竞争时，启用偏向锁性能会提高5%左右。
 * -XX:-UseBiasedLocking关闭偏向锁
 */
public class TestBiased {
    public static List<Integer> numberList = new Vector<Integer>();

    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        int count = 0;
        int startNum = 0;
        while (count < 10000000) {
            numberList.add(startNum);
            startNum += 2;
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

}