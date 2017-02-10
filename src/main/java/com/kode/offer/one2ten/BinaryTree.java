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

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("val", val)
                .add("left", left)
                .add("right", right)
                .toString();
    }
}
