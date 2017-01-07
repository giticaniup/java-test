package com.kode.test.test;

import com.google.common.base.MoreObjects;

/**
 * Created by zhongcy on 2016/8/17.
 */
public class Father {
    protected String name;

    public void sing() {
        System.out.println("father singing...");
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .toString();
    }
}
