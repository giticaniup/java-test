//package com.kode.test.proxy.main;
//
//
//import com.kode.test.proxy.impl.CgLibCounter;
//import com.kode.test.proxy.impl.CgLibProxy;
//
///**
// * Created by zhongcy on 2016/6/3.
// */
//public class CglibMain {
//    public static void main(String[] args) {
//        CgLibProxy cgLibProxy = new CgLibProxy();
//        CgLibCounter cgLibCounter = (CgLibCounter) cgLibProxy.getInstance(new CgLibCounter());
//        cgLibCounter.count(1);
//    }
//}
