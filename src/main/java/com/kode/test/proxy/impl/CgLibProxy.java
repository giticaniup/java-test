//package com.kode.test.proxy.impl;
//
//import net.sf.cglib.proxy.Enhancer;
//import net.sf.cglib.proxy.MethodInterceptor;
//import net.sf.cglib.proxy.MethodProxy;
//
//import java.lang.reflect.Method;
//
///**
// * Created by zhongcy on 2016/6/3.
// */
//public class CgLibProxy implements MethodInterceptor {
//    private Object target;
//
//    /**
//     * 创建代理对象
//     * @param target
//     * @return
//     */
//    public Object getInstance(Object target) {
//        this.target = target;
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(this.target.getClass());
//        // 回调方法
//        enhancer.setCallback(this);
//        // 创建代理对象
//        return enhancer.create();
//    }
//
//    @Override
//    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        System.out.println("开始执行");
//        method.invoke(target,objects);
//        return null;
//    }
//}
