package com.kode.offer.ten2twenty;

/**
 * double数值测试
 * double精度丢失
 * Created by zhongcy on 2017-02-17.
 */
public class DoubleDemo {
    public static void main(String[] args) {
        double a = 0.0011d;
        double b = 0.0011d;
        double c = 99.0123456789123456789d;
        double d = 99.0123456789123456788d;
        System.out.println(a == b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(c == d);

        float f1 = 2.0f;
        float f2 = 1.8f;
        System.out.println(f1 - f2);
        System.out.println(Double.doubleToLongBits(c));
        System.out.println(Double.doubleToLongBits(d));

    }
}
