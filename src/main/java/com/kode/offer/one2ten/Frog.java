package com.kode.offer.one2ten;

/**
 * 类Fb问题
 * Created by zhongcy on 2017-02-16.
 */
public class Frog {
    private static int getSteps(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return getSteps(n-1)+getSteps(n-2);
    }

    public static void main(String[] args) {
        System.out.println(getSteps(3));
    }
}
