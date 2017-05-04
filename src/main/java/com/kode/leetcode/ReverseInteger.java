package com.kode.leetcode;

import org.junit.Test;

/**
 * 优化方案：负数不需要特殊处理，因为负数除和取余得到的结果还是负数
 * Created by zhongchengyong on 2017/5/4.
 */
public class ReverseInteger {
    public int reverse(int x) {
        final int MAX = Integer.MAX_VALUE;
        final int MIN = Integer.MIN_VALUE;
        if (x == 0) {
            return 0;
        }
        int end;
        long num = 0;
        if (x > 0) {
            while (x > 0) {
                end = x % 10;
                x = x / 10;
                if ((num * 10 + end) > MAX) {
                    return 0;
                }
                num = num * 10 +end;
            }
            return (int)num;
        } else {
            x = -x;
            while (x > 0) {
                end = x % 10;
                x = x / 10;
                if (-(num * 10 + end) < MIN) {
                    return 0;
                }
                num = num * 10 +end;
            }
            return (int)-num;
        }
    }

    @Test
    public void test(){
        System.out.println(reverse(1534236469));
        System.out.println(-103%10);
        System.out.println(-103/10);
    }
}
