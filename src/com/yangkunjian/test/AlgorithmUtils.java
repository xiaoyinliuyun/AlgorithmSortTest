package com.yangkunjian.test;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by yangkunjian on 17/9/27.
 */
public class AlgorithmUtils {

    /**
     * 100万个数中找出最大的count个数
     */
    public static int[] max(int count) {
        int[] maxArr = new int[count];
        Integer[] array = Main.random();
        long start = System.currentTimeMillis();
        MergeSorter.sort(array);
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));

        for (int i = 0; i < count; i++) {
            maxArr[i] = array[1000000 - i - 1];
        }
        return maxArr;
    }

    /**
     * 100万个数中找出最大的count个数:通过构建二叉树实现
     */
    public static int[] maxBinaryTree(int count) {
        //1.生成100w个随机数
        Integer[] array = Main.random();
        long start = System.currentTimeMillis();

        //2.构建顺序二叉树
        BinaryTree root = new BinaryTree(array[0]);
        for (int i = 1; i < array.length; i++) {
            root.insertTree(root, array[i]);
        }
        //3.后续遍历得到100个最大的数
        int[] result = new int[100];

        long end = System.currentTimeMillis();
        postOrderTraverse(result,root);
        System.out.println("耗时：" + (end - start));
        return result;
    }

    public static void main(String[] args) {
        int[] maxArr = maxBinaryTree(100);
//        Arrays.sort(maxArr);
        for (int i = 0; i < maxArr.length; i++) {
            System.out.println(maxArr[i]);
        }
    }

    static int num = 0;

    public static void postOrderTraverse(int[] result,BinaryTree bt) {
        if (bt == null) return;

        postOrderTraverse(result, bt.rightTree);
        postOrderTraverse(result, bt.leftTree);
        if (num < 100) {
            result[num++] = bt.data;
        }
    }

    static class BinaryTree {
        int data;
        BinaryTree leftTree;
        BinaryTree rightTree;

        public BinaryTree(int data) {
            this.data = data;
            leftTree = null;
            rightTree = null;
        }

        public void insertTree(BinaryTree root, int data) {
            if (data >= root.data) {
                if (root.rightTree == null) {
                    root.rightTree = new BinaryTree(data);
                } else {
                    insertTree(root.rightTree, data);
                }
            } else {
                if (root.leftTree == null) {
                    root.leftTree = new BinaryTree(data);
                } else {
                    insertTree(root.leftTree, data);
                }
            }
        }
    }
}
