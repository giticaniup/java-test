package com.kode.offer.one2ten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * 倒置输出链表的节点值
 * Created by zhongcy on 2017/2/9.
 */
public class ConvertListNode {

    public static List<Integer> convert(ListNode listNode) {
        List<Integer> integers = new ArrayList<>();
        while (listNode != null) {
            integers.add(listNode.getVal());
            listNode = listNode.getNext();
        }
        return integers;
    }

    /**
     * 递归方法
     *
     * @param listNode
     */
    public static void reverseRecusively(ListNode listNode) {
        if (listNode != null) {
            if (listNode.getNext() != null) {
                reverseRecusively(listNode.getNext());
            }
            System.out.println(listNode.getVal());
        }
    }

    public static void main(String[] args) {
        List<Integer> list = convert(ListNode.init(Arrays.asList(1, 2, 3, 4, 5)));
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        reverseRecusively(ListNode.init(Arrays.asList(1, 2)));
    }
}
