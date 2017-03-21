package com.kode.test.encode;

import java.util.Arrays;

/**
 * Created by zhongcy on 2016/4/20.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 4};
        byte[] arr = Arrays.copyOfRange(bytes, 0, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        //System.out.println(recoverNetworkBytesOrder(bytes));
    }

    private static int recoverNetworkBytesOrder(byte[] orderBytes) {
        int sourceNumber = 0;
        for (int i = 0; i < 4; i++) {
            sourceNumber <<= 8;
            System.out.println(Integer.toBinaryString(sourceNumber));
            System.out.println("合并" + (orderBytes[i] & 0xff));
            System.out.println(Integer.toBinaryString(orderBytes[i] & 0xff));
            sourceNumber |= orderBytes[i] & 0xff;
        }
        return sourceNumber;
    }
}
