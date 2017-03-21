package com.kode;

import com.google.common.base.MoreObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhongcy on 2016/11/30.
 */
public class MemoryDemo01 {

    static class A {
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this)
                    .add("name", name)
                    .toString();
        }
    }

    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            A a = new A();
            a.setName(String.valueOf(i));
            list.add(a);
            a = null;
        }
        System.out.println(list);
    }
}
