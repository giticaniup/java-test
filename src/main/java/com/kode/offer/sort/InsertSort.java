package com.kode.offer.sort;

import java.util.Arrays;

/**
 * InsertSort
 * 思想:外层循环一次，将一个数插入到正确的位置，比插入值大的数往后移
 * 效率:O(n^2)  最好情况为:n 最坏情况n^2  平均效率为n^2/4 略好于冒泡和选择排序
 * 是否稳定:是
 * Created by zhongcy on 2017/2/13.
 */
public class InsertSort {
    public static int[] insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            //如果小于最大值，才进入插入排序
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                int j;
                for (j = i - 1; j >= 0 && array[j] > temp; j--) {
                    array[j + 1] = array[j];
                }
                array[j + 1] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 9, 5, 1, 7, 6, 8, 4};
        System.out.println(Arrays.toString(insertSort(array)));
    }
}
