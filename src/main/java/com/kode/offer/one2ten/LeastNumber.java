package com.kode.offer.one2ten;

/**
 * no8：旋转数组的最小值
 * Created by zhongcy on 2017/2/14.
 */
public class LeastNumber {
    public static int findLeast(int[] array) {
        int result = -1;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                result = array[i+1];
                break;
            }
        }
        return result;
    }
}
