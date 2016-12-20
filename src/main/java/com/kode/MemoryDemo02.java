package com.kode;

import java.util.Collections;
import java.util.List;

/**
 * Created by zhongcy on 2016/12/1.
 */
public class MemoryDemo02 {
    public static void main(String[] args) {
        List<String> list = Collections.singletonList("1");
        System.out.println(pop(list));
    }
    public static<E> E pop(List<E> list){
        if(list==null || list.size()==0){
            return null;
        }
        return list.get(list.size()-1);
    }
}
