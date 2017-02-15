package com.kode.offer.search;

/**
 * 折半查找
 * Created by zhongcy on 2017/2/14.
 */
public class BinarySearch {
    public static int bSearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
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
        System.out.println(bSearch(array, 3));
    }
}
