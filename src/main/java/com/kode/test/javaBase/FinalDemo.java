package com.kode.test.javaBase;

import com.google.common.base.MoreObjects;

import java.util.List;

/**
 * Created by zhongcy on 2016/12/24.
 */
public class FinalDemo {
    final List<String> list;

    public List<String> getList() {
        return list;
    }

    public FinalDemo(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("list", list)
                .toString();
    }
}
