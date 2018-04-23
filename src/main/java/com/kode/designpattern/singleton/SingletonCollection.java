package com.kode.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;
/**
 * 容器类实现单例模式
 * 管理多个单例类型，使用时根据key获取对象对应类型的对象。这种方式可以通过统一的接口获取操作，隐藏了具体实现，降低了耦合度
 */
public class SingletonCollection {
    private static Map<String, Object> objMap = new HashMap<String, Object>();

    public static void regsiterService(String key, Object instance) {
        if (!objMap.containsKey(key)) {
            objMap.put(key, instance);
        }
    }

    public static Object getService(String key) {
        return objMap.get(key);
    }
}
