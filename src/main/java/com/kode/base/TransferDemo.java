package com.kode.base;

/**
 * 关于java中的引用传递和值传递
 * 参数传递基本上就是赋值操作
 * 也就是说，传int是将int的值赋值给变量，int本身的值不会改变
 * 传引用类型传的是引用的内存地址，如果参数本身有可以改变值的函数，如sb.append()函数，是会改变原值的
 *
 * @see com.kode.base.Test
 * Created by zhongcy on 2017-03-05.
 */
public class TransferDemo {
    public static void main(String[] args) {
        int origin = 1;
        int intResult = transferInt(origin);
        System.out.println(intResult);
        System.out.println(origin);

        String s = "1";
        String strResult = transferStr("s");
        System.out.println(strResult);
        System.out.println(s);
    }

    private static String transferStr(String s) {
        s = "2";
        return s;
    }

    public static int transferInt(int i) {
        i = 2;
        return 2;
    }
}
