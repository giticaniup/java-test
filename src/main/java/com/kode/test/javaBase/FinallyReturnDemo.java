package com.kode.test.javaBase;

/**
 * 不要在finally中使用return语句，因为finally是会最终执行的，编译器会将如下代码编译为：
 * <p>
 * public static int get(int var0) {
 * try {
 * int var1 = 1 / var0;
 * return 0;
 * } catch (Exception var5) {
 * var5.printStackTrace();
 * return 0;
 * } finally {
 * ;
 * }
 * }
 * Created by zhongcy on 2017-02-16.
 */
public class FinallyReturnDemo {
    public static int get(int i) {
        try {
            return 1 / i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(get(1));
        System.out.println(get(0));
    }
}
