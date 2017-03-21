package com.kode.offer.ten2twenty;

import com.kode.offer.one2ten.ListNode;

import java.util.Arrays;

/**
 * 合并两个升序链表
 * 还有另外一种递归实现
 * Created by zhongcy on 2017-02-20.
 */
public class MergeTwoListNode {
    private static ListNode merge(ListNode n1, ListNode n2) {
        if (n1 == null || n2 == null) {
            return n1 == null ? n2 : n1;
        }
        ListNode listNode = new ListNode();
        //保存引用
        ListNode result = listNode;
        while (n1 != null && n2 != null) {
            if (n1.getVal() >= n2.getVal()) {
                listNode.setVal(n2.getVal());
                listNode.setNext(new ListNode());
                listNode = listNode.getNext();
                n2 = n2.getNext();
            } else {
                listNode.setVal(n1.getVal());
                listNode.setNext(new ListNode());
                listNode = listNode.getNext();
                n1 = n1.getNext();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode n1 = ListNode.init(Arrays.asList(1, 3, 5, 7));
        ListNode n2 = ListNode.init(Arrays.asList(2, 4, 6, 8));
        System.out.println(merge(n1, n2));
    }
}
