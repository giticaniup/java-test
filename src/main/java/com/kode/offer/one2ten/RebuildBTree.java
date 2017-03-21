package com.kode.offer.one2ten;

/**
 * 重建二叉树
 * 根据前序和中序的输入建立二叉树
 * 算法思路：前序的第一个节点就是二叉树的跟节点，找到这个根节点在中序遍历的位置，位置左侧的就是左子树，右侧的是右子树，
 * 如此递归
 * Created by zhongcy on 2017/2/9.
 */
public class RebuildBTree {
    public static BinaryTree rebuild(int[] pre, int[] mid) {
        int length = pre.length;
        if (length != mid.length) {
            throw new RuntimeException("输入长度不一致");
        }
        return reBuildBTree(pre, 0, length - 1, mid, 0, length - 1);
    }

    public static BinaryTree reBuildBTree(int[] preOrder, int preLeft, int preRight, int[] middleOrder, int midLeft,
                                          int midRight) {
        if (preOrder == null || middleOrder == null) {
            return null;
        }
        int mid = preOrder[preLeft];
        BinaryTree bt = new BinaryTree(mid);
        int rootIndex = midLeft;
        //找出根节点的位置
        while (rootIndex <= midRight && middleOrder[rootIndex] != mid) {
            rootIndex++;
        }
        if (rootIndex == midRight && middleOrder[rootIndex] != mid) {
            throw new RuntimeException("输入不合法");
        }
        int leftSize = rootIndex - midLeft;

        //如果有左子树
        if (rootIndex > midLeft) {
            bt.left = reBuildBTree(preOrder, preLeft + 1, preLeft + leftSize, middleOrder, midLeft, rootIndex - 1);
        }
        //如果有右子树
        if (midRight > rootIndex) {
            bt.right = reBuildBTree(preOrder, preLeft + leftSize + 1, preRight, middleOrder, rootIndex + 1, midRight);
        }
        return bt;
    }

    public static void printPreBTree(BinaryTree bt) {
        if (bt == null) {
            return;
        } else {
            System.out.println(bt.val);
        }
        if (bt.left != null) {
            printPreBTree(bt.left);
        }
        if (bt.right != null) {
            printPreBTree(bt.right);
        }
    }

    public static void main(String[] args) {
        int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8}, midOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        BinaryTree bt = rebuild(preOrder, midOrder);
        printPreBTree(bt);
    }
}
