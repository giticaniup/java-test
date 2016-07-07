package com.kode.test.inter;

/**
 * Created by zhongcy on 2016/4/15.
 */
public class TestError {
    public static void main(String[] args) {
        ErrorCodeEnum.PARAM_ILLEGAL.setDescription("111");
        System.out.println(ErrorCodeEnum.PARAM_ILLEGAL);
        ErrorCodeEnum.TWO_ILLEGAL.setDescription("111");
        System.out.println(ErrorCodeEnum.TWO_ILLEGAL);
    }
}
