package com.kode.offer.sort;

import java.util.Arrays;

/**
 * HeapSort
 * 算法：先构建一个大顶堆，用堆顶数据和最后一个数交换，再国建大顶堆，循环此过程
 * 算法复杂度：nlogn
 * 是否稳定：否
 * Created by zhongcy on 2017/2/14.
 */
public class HeapSort {

    public static void heapSort(int[] array, int start, int length) {
        int temp = array[start];
        int j;
        //左子节点
        for (j = 2 * start; j < length; j *= 2) {
            if (j < length - 1 && array[j] < array[j + 1]) {
                j++;
            }
            if (temp >= array[j]) {
                break;
            }
            array[start] = array[j];
            start = j;
        }
        array[start] = temp;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 9, 5, 1, 7, 6, 8, 4};
        int i;
        for (i = array.length / 2; i >= 0; i--) {
            heapSort(array, i, array.length);
        }
        System.out.println(Arrays.toString(array));
        for (i = array.length - 1; i > 0; i--) {
            Utils.swap(array, 0, i);
            //将剩下的调整未大顶堆,长度为i
            heapSort(array, 0, i);
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}
