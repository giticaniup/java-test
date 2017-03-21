package com.kode.leetcode;

import com.google.common.base.MoreObjects;

/**
 * leetCode第二题
 * 给定两个List，每个List上有数字节点，将这些数字节点相加后返回一个新的数字节点
 * Created by zhongcy on 2016/12/19.
 */
public class AddTwoNum {
    public static ListNode addTwoNum(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode middle = result;
        int carry = 0;//进位
        while (l1 != null || l2 != null || carry != 0) {
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;
            int sum = v1 + v2 + carry;
            int node = sum % 10;
            carry = sum / 10;
            middle.next = new ListNode(node);
            middle = middle.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        System.out.println(addTwoNum(l1, l2));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("val", val)
                .toString();
    }
}
