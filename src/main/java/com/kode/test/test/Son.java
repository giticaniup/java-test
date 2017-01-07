package com.kode.test.test;

import com.google.common.base.MoreObjects;

/**
 * 向上向下转型
 * Created by zhongcy on 2016/8/17.
 */
public class Son extends Father {

    public void say() {
        System.out.println("son is saying...");
    }

    @Override
    public void sing() {
        System.out.println("son singing....");
    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("id", id)
                .toString();
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.sing();
        son.setId("1");
        Father father = son;
        System.out.println(father);
        father.sing();

        Father father1 = new Father();
        Son son1 = (Son) father;
        son1.say();

        Son son2 = new Son();
        Father father2 = son2;
        father2.sing();
    }
}
