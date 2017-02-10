package com.kode.offer.one2ten;

import com.google.common.base.MoreObjects;

/**
 * 二叉树
 * Created by zhongcy on 2017/2/8.
 */
public class BinaryTree {
    public int val;

    public BinaryTree left;

    public BinaryTree right;

    public BinaryTree() {
    }

    public BinaryTree(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("val", val)
                .add("left", left)
                .add("right", right)
                .toString();
    }

}
