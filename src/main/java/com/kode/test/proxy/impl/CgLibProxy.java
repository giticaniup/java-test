package com.kode.test.proxy.impl;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理类
 * cglib的动态代理：
 * cglib使用ASM这一轻量但高性能的字节码操作框架来转化字节码，产生新类。
 * 本质上来说，对于需要被代理的类，它只是动态生成一个子类覆盖非final的方法，
 * 同时绑定钩子回调自定义的拦截器，比jdk动态代理快。
 * Created by zhongcy on 2016/6/3.
 */
public class CgLibProxy implements MethodInterceptor {
    private Object target;

    /**
     * 创建代理对象
     *
     * @param target
     * @return
     */
    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        // 回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始执行");
        methodProxy.invoke(target, objects);
        return null;
    }
}
