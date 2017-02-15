package com.kode.offer.search;

/**
 * 插值查找
 * mid的值计算方法变更
 * Created by zhongcy on 2017/2/14.
 */
public class InsertValueSearch {
    public static int ivSearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            //适合均匀分布
            int mid = (high - low) * (key - array[low]) / (array[high] - array[low]) + low;
            if (array[mid] < key) {
                low = mid + 1;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(ivSearch(array, 3));
    }
}
