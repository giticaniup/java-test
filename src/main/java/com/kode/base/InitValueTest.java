package com.kode.base;

import org.junit.*;

/**
 * 验证函数内的变量初始化和类中的变量初始化
 * Created by zhongchengyong on 2018/1/1.
 */
public class InitValueTest {

    int outi;

    public void testUse(){
        System.out.println(outi);  // 类中定义的变量，赋默认值
        int ini;
//        System.out.println(ini); // 如果在这里使用没有初始化的函数内变量i，则编译器报错，这个和c++处理逻辑一致。
    }

    @org.junit.Test
    public void runTest() {
        testUse();
    }
}
