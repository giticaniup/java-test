package com.kode.offer.ten2twenty;

import java.util.Arrays;

/**
 * 遍历二维数组
 * 第20题
 * Created by zhongcy on 2017-02-20.
 */
public class ErgodicArray {
    private static void getErgodicResult(int[][] array) {
        if (array == null) {
            return;
        }
        int column = array.length;
        int row = array[0].length;

        //每转一次，这行/列的数字总数减2.所以循环的次数是 Math.Ceil(n/2)
        int start = 0;
        while (column > start * 2 && row > start * 2) {
            ergodicArray(array, column, row, start);
            start++;
        }
    }

    private static void ergodicArray(int[][] array, int column, int row, int start) {
        column = column - 1 - start;
        row = row - 1 - start;
        //第一行
        //行列的取值有两个值，当第一行或者是第一列时值为start，否则为row或column
        for (int i = start; i <= column; i++) {
            System.out.println(array[start][i]);
        }
        if (start < row) {
            for (int i = start + 1; i <= row; i++) {
                System.out.println(array[i][column]);
            }
            for (int i = column - 1; i >= start; i--) {
                System.out.println(array[row][i]);
            }
            for (int i = row - 1; i > start; i--) {
                System.out.println(array[i][start]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = i + j;
            }
        }
        System.out.println(Arrays.deepToString(array));
        getErgodicResult(array);
    }

}
