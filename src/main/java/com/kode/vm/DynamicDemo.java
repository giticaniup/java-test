package com.kode.vm;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理Demo
 * Created by zhongcy on 2017/2/12.
 */
public class DynamicDemo {
    static interface IHello{
        void say();
    }

    static class Hello implements IHello{

        @Override
        public void say() {
            System.out.println("Hello");
        }
    }

    static class HelloDynamic implements InvocationHandler{

        Object originalObj;

        public Object bind(Object originalObj) {
            this.originalObj = originalObj;
            return Proxy.newProxyInstance(originalObj.getClass().getClassLoader(),
                    originalObj.getClass().getInterfaces(),this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("welcome");
            return method.invoke(originalObj,args);
        }
    }

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles",true);
        IHello hello = (IHello) new HelloDynamic().bind(new Hello());
        hello.say();
    }
}
