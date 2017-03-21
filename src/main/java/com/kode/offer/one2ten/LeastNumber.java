package com.kode.offer.one2ten;

/**
 * no8：旋转数组的最小值
 * Created by zhongcy on 2017/2/14.
 */
public class LeastNumber {
    private static int findLeast(int[] array) {
        int low = 0;
        int high = array.length - 1;
        int mid = low;
        while (low < high && array[low] >= array[high]) {
            //只有两个数，就没有必要折半查找了。避免两个相邻的数字出现死循环
            if (high - low == 1) {
                mid = high;
                break;
            }
            //折半查找
            mid = (low + high) / 2;
            if (array[mid] >= array[low]) {
                //数组还在递增，使用新的low值进入下次循环
                low = mid;
            } else if (array[mid] < array[high]) {
                high = mid;
            } else if (array[low] == array[mid] && array[mid] == array[high]) {
                return findLeastByOrder(array);
            }
        }
        return array[mid];
    }

    /**
     * 顺序查找
     */
    private static int findLeastByOrder(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2};
        System.out.println(findLeast(array));
    }
}
