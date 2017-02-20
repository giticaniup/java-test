package com.kode.offer.ten2twenty;

import com.kode.offer.one2ten.BinaryTree;

/**
 * 给定两个二叉树，判断1中是否包含2
 * 概述：递归调用判断左右子树，递归判断是否相等
 * 第18题
 * Created by zhongcy on 2017-02-20.
 */
public class SubTree {
    private boolean hasSubTree(BinaryTree b1, BinaryTree b2) {
        if (b1 == null) {
            return false;
        }
        if (b2 == null) {
            return true;
        }
        if (b1.val == b2.val) {
            return doesContain(b1, b2);
        }
        hasSubTree(b1.left, b2);
        hasSubTree(b1.right, b2);
        return false;
    }

    private boolean doesContain(BinaryTree b1, BinaryTree b2) {
        return b1 != null && (b2 == null || (b1.val == b2.val && doesContain(b1.left, b2.left)
                && doesContain(b1.right, b2.right)));
    }
}
