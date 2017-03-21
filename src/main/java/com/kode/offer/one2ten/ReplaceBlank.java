package com.kode.offer.one2ten;

/**
 * 替换字符串的空格
 * Created by zhongcy on 2017/2/9.
 */
public class ReplaceBlank {

    public static String replaceBlank(String s) {
        return s.replaceAll(" ", "%20");
    }

    public static void main(String[] args) {
        System.out.println(replaceBlank("232   23 2323   12"));
    }

}
