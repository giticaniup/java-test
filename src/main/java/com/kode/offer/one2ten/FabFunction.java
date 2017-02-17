package com.kode.offer.one2ten;

/**
 * 斐波拉契数列
 * Created by zhongcy on 2017-02-16.
 */
public class FabFunction {
    private static int fb(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fb(n - 1) + fb(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fbRecycle(10));
    }

    private static int fbRecycle(int n) {
        if (n < 2) {
            return n == 0 ? 0 : 1;
        }
        int left = 0;
        int right = 1;
        int fn = 0;
        for(int i= 2;i<=n;i++){
            fn = left+right;
            left = right;
            right = fn;
        }
        return fn;
    }
}
