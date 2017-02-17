package com.kode.offer.sort;


import org.junit.Test;

import java.util.Arrays;

/**
 * SimpleSelectSort
 * 思想：外层循环一次，找出第i小的值。内层循环找出最小值所在位置，交换
 * 效率：O(n^2)  最好情况为:n 最坏情况n^2
 * 是否稳定：是
 * Created by zhongcy on 2017/2/10.
 */
public class SimpleSelectSort {
    public int[] simpleSort(int[] array){
        for(int i=0;i<array.length;i++){
            int min = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min = j;
                }
            }
            if(min!=i){
                Utils.swap(array,i,min);
            }
        }
        return array;
    }

    @Test
    public void testSimpleSort(){
        int[] array = {2, 3, 9, 5, 1, 7, 6, 8, 4};
        System.out.println(Arrays.toString(simpleSort(array)));
    }
}
