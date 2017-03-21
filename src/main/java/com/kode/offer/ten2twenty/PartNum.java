package com.kode.offer.ten2twenty;

import com.kode.offer.sort.Utils;

import java.util.Arrays;

/**
 * 区分数组中的元素，将奇数全部放在前面，偶数全部放在后面
 * Created by zhongcy on 2017-02-17.
 */
public class PartNum {

    private static int[] part(int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            while (low < high && !isEven(array[low])) {
                low++;
            }
            while (low < high && isEven(array[high])) {
                high--;
            }
            if (low < high) {
                Utils.swap(array, low, high);
            }
        }
        return array;
    }

    private static boolean isEven(int n) {
        return (n & 1) != 1;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 9, 5, 1, 7, 6, 8, 4};
        System.out.println(Arrays.toString(part(array)));
    }
}
