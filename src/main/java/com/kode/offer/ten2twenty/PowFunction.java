package com.kode.offer.ten2twenty;

/**
 * 实现指数函数
 * Created by zhongcy on 2017-02-17.
 */
public class PowFunction {
    private static double getPow(double base, int exponent) {
        if (base == 0 && exponent < 0) {
            throw new RuntimeException("输入不合法");
        }
        double result = 0d;
        if (exponent < 0) {
            int absExponent = -exponent;
            result = pow(base, absExponent);
        }
        if (exponent < 0) {
            result = 1.0 / result;
        }
        return result;
    }

    private static double pow(double base, int exponent) {
        for (int i = 1; i < exponent; i++) {
            base = base * base;
        }
        return base;
    }

    /**
     * 优化的函数
     * 使用n/2 +n/2来计算
     */
    private static double betterPow(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return exponent;
        }
        double result;
        result = betterPow(base, exponent >> 1);
        result = result * result;
        if ((exponent & 1) == 1) {
            result = result * base;
        }
        return result;
    }
}
