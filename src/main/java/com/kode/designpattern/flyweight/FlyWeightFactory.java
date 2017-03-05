package com.kode.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式
 * 构造一个对象池来实现对象的重复使用
 * Created by zhongcy on 2017-03-03.
 */
public class FlyWeightFactory {
    private Map<String,FlyWeight> pool = new HashMap<>();

    private FlyWeightFactory() {
    }

    public FlyWeight getInstance(String key){
        FlyWeight flyWeight;
        if(pool.containsKey(key)){
            flyWeight =  pool.get(key);
        }else {
            flyWeight = new ConcreteFlyWeight(key);
            pool.put(key,flyWeight);
        }
        return flyWeight;
    }
}
