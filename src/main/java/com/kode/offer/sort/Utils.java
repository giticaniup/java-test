package com.kode.offer.sort;

/**
 * 工具方法
 * Created by zhongcy on 2017/2/10.
 */
public class Utils {
    public static void swap(int[] array, int a, int b) {
        int i = array[a];
        array[a] = array[b];
        array[b] = i;
    }

    public static void main(String[] args) {
        int[] array = {1, 2};
        swap(array, 0, 1);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
