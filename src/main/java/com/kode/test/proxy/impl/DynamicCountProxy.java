package com.kode.test.proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhongcy on 2016/6/3.
 */
public class DynamicCountProxy implements InvocationHandler{
    public Object object;

    public Object bind(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理");
        Object result = method.invoke(object,args);
        System.out.println("result"+result);
        return result;
    }
}
