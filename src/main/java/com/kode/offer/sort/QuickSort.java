package com.kode.offer.sort;

import java.util.Arrays;

/**
 * 快速排序
 * 算法思想：通过 趟排序将待排记录分割成独立的两部分，其中一部分记录的关键字均比另 部分记录的关键字小，
 * 则可分别对这两部分记录继续进行排序，以达到整个序列有序的目的
 * 和冒泡排序类似，是两两替换之后得出排序的结果，只不过替换的位置比冒泡更大
 * 最优情况下：快速排序算法的时间复杂度为 O(nlogn)，算法复杂度主要由找pivot的效率决定
 * 最差情况下：快速排序的时间复杂度为O(n^2)
 * 是否稳定：否 由于在调换位置时会出现不稳定
 * Created by zhongcy on 2017/2/14.
 */
public class QuickSort {
    private static int[] qSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            qSort(array, low, pivot - 1);
            qSort(array, pivot + 1, high);
        }
        return array;
    }

    private static int partition(int[] array, int low, int high) {
        int temp = array[low];
        while (low < high) {
            //大的在右侧，小的在左侧
            while (low < high && array[high] > temp) {
                high--;
            }
            Utils.swap(array, low, high);
            while (low < high && array[low] < temp) {
                low++;
            }
            Utils.swap(array, low, high);
        }
        return low;
    }

    //改良版，数的移动不再使用swap方法而是直接替换
    private static int partition2(int[] array, int low, int high) {
        int temp = array[low];
        while (low < high) {
            //大的在右侧，小的在左侧
            while (low < high && array[high] > temp) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] < temp) {
                low++;
            }
            array[high] = array[low];
        }
        //将temp值放在中轴位置
        array[low] = temp;
        return low;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 9, 5, 1, 7, 6, 8, 4};
        System.out.println(Arrays.toString(qSort(array, 0, array.length - 1)));
    }
}
