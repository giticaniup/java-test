package com.kode.vm;

/**
 * 类变量可以不赋初值
 * 在准备阶段赋予系统初始值
 * Created by zhongcy on 2017/2/12.
 */
public class StaticDemo {

    static int i;
    public static void main(String[] args) {
        System.out.println(i);
    }
}
