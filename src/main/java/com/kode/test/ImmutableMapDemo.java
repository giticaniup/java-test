package com.kode.test;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Created by zhongcy on 2016/4/25.
 */
public class ImmutableMapDemo {
    public static void main(String[] args) {
        ImmutableMap<String, Set<String>> typesMap = new ImmutableMap.Builder<String, Set<String>>().put("images", Sets.newHashSet("jpg", "png")).build();
        System.out.println(typesMap);
    }
}
