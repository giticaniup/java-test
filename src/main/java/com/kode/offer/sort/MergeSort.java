package com.kode.offer.sort;

import java.util.Arrays;

/**
 * 归并排序
 * 算法思想:先拆再合，递归实现
 * 复杂度:nlogn
 * 是否稳定：是
 * Created by zhongcy on 2017/2/14.
 */
public class MergeSort {
    public static int[] sort(int[] array, int start, int end) {
        int mid = (start + end) / 2;
        if (start < end) {
            sort(array, start, mid);
            sort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
        return array;
    }

    private static void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int k = 0;
        int i, j;
        for (i = start, j = mid + 1; i <= mid && j <= end; ) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= end) {
            temp[k++] = array[j++];
        }
        //复制数组到array中
        System.arraycopy(temp, 0, array, start, temp.length);
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 9, 5, 1, 7, 6, 8, 4};
        System.out.println(Arrays.toString(sort(array, 0, array.length - 1)));
    }
}
