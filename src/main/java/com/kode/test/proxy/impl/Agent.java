package com.kode.test.proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhongcy on 2016/6/3.
 */
public class Agent implements InvocationHandler {

    public  Object target;

    //绑定
    public Object bind(Object target){
        this.target=target;
        //必须放回Proxy
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    //重新
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object o =null;
        System.out.println("开始事务");
        System.out.println("判断权限");

        o = method.invoke(target, args);//执行方法

        System.out.println("结束事务");
        return o;
    }

}
