package com.kode.offer.ten2twenty;

import com.kode.offer.one2ten.ListNode;

/**
 * 删除链表中的节点，要求时间复杂度为O(1)
 * Created by zhongcy on 2017-02-17.
 */
public class DeleteNode {
    private static ListNode deleteNode(ListNode listNode, ListNode toDelete) {
        if (listNode == null || listNode.equals(toDelete)) {
            return null;
        }

        //如果要删除的是最后一个节点，只能遍历整个链表删除节点
        if (toDelete.getNext() == null) {
            while (!listNode.getNext().equals(toDelete)) {
                listNode = listNode.getNext();
            }
            listNode.setNext(null);
            return listNode;
        }

        ListNode next = toDelete.getNext();
        toDelete = next;
        //delete next
        return next;
    }
}
