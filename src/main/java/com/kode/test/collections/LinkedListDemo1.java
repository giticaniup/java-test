package com.kode.test.collections;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Java中所有的链表都是双向的，如LinkedList提供了previous方法
 * 在LinkedList中添加元素到中间某个位置，使用ListIterator
 * Created by zhongcy on 2017/1/4.
 */
public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("1");
        ll.add("2");
        ll.add("3");
        ListIterator<String> iterator = ll.listIterator(2);
        iterator.previous();
        iterator.set("new");
        iterator.previous();
        iterator.set("new 1");
        iterator.next();
        iterator.set("new 2");
        System.out.println(ll);
        ll.get(1);
    }
}
