package com.kode.test.javaBase;

import com.google.common.base.MoreObjects;

/**
 * 深克隆和浅克隆
 * 默认的克隆方法是浅克隆，引用对象不拷贝
 * Created by zhongcy on 2017-02-15.
 */
public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneObject co = new CloneObject();
        System.out.println(co);
        System.out.println(co.clone());
    }
}
class CloneObject implements Cloneable{
    private Integer id = 1;

    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .toString();
    }
}