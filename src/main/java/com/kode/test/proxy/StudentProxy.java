package com.kode.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhongcy on 2016/4/1.
 */
public class StudentProxy implements InvocationHandler{
    private Object target;

    public Object newInstance(Object target){
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("begin");
        method.invoke(target);
        System.out.println("end");
        return null;
    }
}
