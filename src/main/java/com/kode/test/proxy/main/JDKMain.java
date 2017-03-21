package com.kode.test.proxy.main;


import com.kode.test.proxy.Count;
import com.kode.test.proxy.impl.CountImpl;
import com.kode.test.proxy.impl.DynamicCountProxy;

/**
 * JDK动态代理类
 * Created by zhongcy on 2016/6/3.
 */
public class JDKMain {
    public static void main(String[] args) {
        //先创建代理对象
        DynamicCountProxy dynamicCountProxy = new DynamicCountProxy();
        //为被代理对象创建实例，使用bind方法
        Count count = dynamicCountProxy.bind(new CountImpl());
        //调用目标方法
        count.count();
    }
}
