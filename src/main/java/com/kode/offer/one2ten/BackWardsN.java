package com.kode.offer.one2ten;

import java.util.Arrays;

/**
 * 获取链表的倒数第k个节点
 * 算法思想：构造两个指针，第一个指针先走k-1步，再两个指针同时走，第一个指针走完，第二个指针所在的位置是倒数第k个
 * 鲁棒：需要考虑k值和链表长度的关系
 * Created by zhongcy on 2017/2/8.
 */
public class BackWardsN {
    private static int getBackK(int k, ListNode listNode) {
        ListNode l1 = listNode;
        ListNode l2 = listNode;
        for (int i = 0; i < k - 1; i++) {
            if (l1 == null) {
                throw new RuntimeException("参数输入不合法");
            }
            l1 = l1.getNext();
        }
        while (l1.getNext() != null) {
            l1 = l1.getNext();
            l2 = l2.getNext();
        }
        return l2.getVal();
    }

    public static void main(String[] args) {
        int result = getBackK(10, ListNode.init(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(result);
    }
}
