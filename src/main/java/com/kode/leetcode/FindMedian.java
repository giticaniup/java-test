package com.kode.leetcode;

import org.junit.Test;

/**
 * 寻找中位数
 * Created by zhongchengyong on 2017/4/12.
 */
public class FindMedian {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                result[k++] = nums1[i++];
            }else{
                result[k++] = nums2[j++];
            }
        }
        while(i<nums1.length){
            result[k++] = nums1[i++];
        }
        while(j<nums2.length){
            result[k++] = nums2[j++];
        }
        int length = result.length;
        if(length%2==0){
            return ((double)result[k/2]+(double)result[k/2-1])/2;
        }
        return result[k/2];
    }


    @Test
    public void test(){
        int[] n1= {1};
        int[] n2= {1};
        double result = findMedianSortedArrays(n1 , n2);
        System.out.println(result);
    }
}