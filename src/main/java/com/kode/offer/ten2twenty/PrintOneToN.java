package com.kode.offer.ten2twenty;

/**
 *
 * Created by zhongcy on 2017-02-17.
 */
public class PrintOneToN {
    private static void print(int n) {
        int number = 1;
        for(int i=0;i<n;i++){
            number = number*10;
        }
        for(int i=0;i<number;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        print(3);
    }
}
