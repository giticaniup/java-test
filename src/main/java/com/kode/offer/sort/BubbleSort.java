package com.kode.offer.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * BubbleSort
 * 思想：每一次外层循环，将最小的数字往上冒
 * 效率：O(n^2)  最好情况为:n 最坏情况n^2
 * 是否稳定：是
 * Created by zhongcy on 2017/2/10.
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("----");
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    Utils.swap(array, j, j - 1);
                }
            }
        }
        return array;
    }

    /**
     * 改良的冒泡，引入标志位，当没有数据需要更换位置时，也就没有必要进入下一次外层循环
     *
     * @param array 入参
     */
    public static int[] bubbleSortBetter(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length && flag; i++) {
            System.out.println("----");
            flag = false;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j-1] > array[j]) {
                    Utils.swap(array, j, j - 1);
                    flag = true;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 9, 5, 1, 7, 6, 8, 4};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    @Test
    public void testBubbleBetter(){
        int[] array = {2, 3, 9, 5, 1, 7, 6, 8, 4};
        System.out.println(Arrays.toString(bubbleSortBetter(array)));
    }

    @Test
    public void testBubbleBetterWithOrder(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(bubbleSort(array)));
        System.out.println(Arrays.toString(bubbleSortBetter(array)));
    }
}
