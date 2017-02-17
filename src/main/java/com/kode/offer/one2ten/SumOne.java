package com.kode.offer.one2ten;

/**
 * 输入一个整数，
 * 二进制数的二进制运算，使用最后一位和数做二进制运算
 * 尽量使用移位运算代替乘除法
 * 二进制标识：0b
 * 把一个整数与整数减1做与运算，会把最右边的1消除
 * 其中，异或运算^需要注意一下
 * Created by zhongcy on 2017-02-16.
 */
public class SumOne {
    private static int countOne(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    private static void migrateNum() {
        int i = 0b1100;
        int j = 0b1011;
        System.out.println(i & j);
        System.out.println(i);
        System.out.println(12 & 11);
    }

    /**
     * 统计1的个数，使用改良算法
     * 由于(n-1)&n会消除一个二进制字符串中的1，所以可以利用此特性来减少循环次数
     *
     * @param n 输入n的小大小
     */
    private static int countOneByCountDown(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(countOne(3));
//        migrateNum();
        System.out.println(countOneByCountDown(3));
    }


}
