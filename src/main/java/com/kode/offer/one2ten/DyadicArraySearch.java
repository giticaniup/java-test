package com.kode.offer.one2ten;

/**
 * 二维数组查找
 * 二维数组，从左至右由小到大，从上至下由小到大
 * Created by zhongcy on 2017/2/9.
 */
public class DyadicArraySearch {

    /**
     * 选取右上角的数字作为查找的开始
     *
     * @param array   数组
     * @param rows    行
     * @param columns 列
     */
    public static boolean search(int[][] array, int rows, int columns, int i) {
        boolean find = false;
        if (array == null || rows <= 0 || columns <= 0) {
            return false;
        }
        for (int row = 0, column = columns - 1; row < rows && column > 0; ) {
            if (array[row][column] == i) {
                find = true;
                break;
            } else if (array[row][column] < i) {
                row++;
            } else {
                column--;
            }
        }
        return find;
    }

    public static void main(String[] args) {
        int row = 5, column = 5;
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = i + j;
                System.out.println(array[i][j]);
            }
        }
        boolean result = search(array, row, column, 9);
        System.out.println(result);
    }
}
