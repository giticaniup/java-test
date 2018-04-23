package com.kode.base;

/**
 * Java不存在函数和变量作用域重载的情况。
 * 与c++不同，在c++中，如果函数名和变量名相同，则使用当前scope的变量或函数，即：名称匹配优先。
 * Created by zhongchengyong on 2018/1/13.
 */
public class TestScope {
    private void read() {

    }

    private void match(long l){

    }

    private void matchDouble(double d) {

    }

    private int testScope() {
        int read = 1;
        System.out.println(read);
        read();
        match(read);
        matchDouble(read);
        return 0;
    }

}
