package com.kode.offer.one2ten;

import com.google.common.base.MoreObjects;

import java.util.List;

/**
 * 链表结构，用于基础使用
 * Created by zhongcy on 2017/2/8.
 */
public class ListNode {
    private int val;

    private ListNode next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("val", val)
                .add("next", next)
                .toString();
    }

    public static ListNode init(List<Integer> integerList) {
        if (integerList == null || integerList.size() == 0) {
            return null;
        }
        ListNode listNode = new ListNode();
        ListNode middle = listNode;
        for(int i=0;i<integerList.size()-1;i++){
            middle.val = integerList.get(i);
            middle.next = new ListNode();
            middle = middle.next;
        }
        middle.val = integerList.get(integerList.size()-1);
        return listNode;
    }

}
