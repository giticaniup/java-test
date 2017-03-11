package com.kode.offer.sort;

import java.util.Arrays;

/**
 * ShellSort
 * 思想：使用增量，每一遍使用插入排序，让整个数组基本有序
 * 算法逻辑：只要增量d>1，一直循环，最后一遍的d一定是1。
 * 增量内部为插入排序
 * 效率：O(n^(3/2))
 * 是否稳定：否
 * Created by zhongcy on 2017/2/13.
 */
public class ShellSort {

    public static int[] shellSort(int[] array) {
        int d = array.length;
        do {
            d = d / 2;
            for (int i = 0; i < d; i++) {
                //内部为插入排序
                for (int j = i + d; j < array.length; j = j + d) {
                    if(array[j]<array[j-d]) {
                        int temp = array[j];
                        int q;
                        //一个个做插入排序，保证前面为有序数组
                        for (q = j - d; q >= 0 && array[q] > temp; q = q - d) {
                            array[q + d] = array[q];
                        }
                        array[q + d] = temp;
                    }
                }
            }
        } while (d > 1);
        return array;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 11, 9, 5, 1, 7, 6, 8, 4};
        System.out.println(Arrays.toString(shellSort(array)));
    }
}
