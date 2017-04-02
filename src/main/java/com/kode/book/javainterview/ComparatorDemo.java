package com.kode.book.javainterview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Arrays.sort()参数需要实现comparator接口
 * 运行结果：java.lang.ClassCastException: com.kode.book.javainterview.ComparatorDemo$NotComparable
 * cannot be cast to java.lang.Comparable
 * Created by zhongchengyong on 2017/4/2.
 */
public class ComparatorDemo {

    @Test
    public void testComparable() {
        List<NotComparable> list = new ArrayList<>();
        list.add(new NotComparable(1));
        list.add(new NotComparable(2));
        list.add(new NotComparable(3));
        Arrays.sort(list.toArray());
    }

    static class NotComparable {
        private int i;

        public NotComparable(int i) {
            this.i = i;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}
