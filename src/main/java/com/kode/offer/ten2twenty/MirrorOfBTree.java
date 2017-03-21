package com.kode.offer.ten2twenty;

import com.kode.offer.one2ten.BinaryTree;

/**
 * 二叉树镜像
 * 交换左右子树，递归完成
 * Created by zhongcy on 2017-02-20.
 */
public class MirrorOfBTree {
    private BinaryTree mirror(BinaryTree bTree) {
        if (bTree == null) {
            return null;
        }
        BinaryTree temp = bTree.left;
        bTree.left = bTree.right;
        bTree.right = temp;
        if (bTree.left != null) {
            mirror(bTree.left);
        }
        if (bTree.right != null) {
            mirror(bTree.right);
        }
        return bTree;
    }
}
