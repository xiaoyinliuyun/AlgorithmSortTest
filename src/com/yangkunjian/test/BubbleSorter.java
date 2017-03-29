package com.yangkunjian.test;

/**
 * Created by yangkunjian on 17/3/29.
 */
public class BubbleSorter {

//            4,6,2,1,7,9,8,0,3,5,
//            4,6,2,1,7,9,0,8,3,5,
//            4,6,2,1,7,0,9,8,3,5,
//            4,6,2,1,0,7,9,8,3,5,
//            4,6,2,0,1,7,9,8,3,5,
//            4,6,0,2,1,7,9,8,3,5,
//            4,0,6,2,1,7,9,8,3,5,
//            0,4,6,2,1,7,9,8,3,5,
//            --------------------------
//            0,4,6,2,1,7,9,3,8,5,
//            0,4,6,2,1,7,3,9,8,5,
//            0,4,6,2,1,3,7,9,8,5,
//            0,4,6,1,2,3,7,9,8,5,
//            0,4,1,6,2,3,7,9,8,5,
//            0,1,4,6,2,3,7,9,8,5,
//            --------------------------
//            0,1,4,6,2,3,7,9,5,8,
//            0,1,4,6,2,3,7,5,9,8,
//            0,1,4,6,2,3,5,7,9,8,
//            0,1,4,2,6,3,5,7,9,8,
//            0,1,2,4,6,3,5,7,9,8,
//            --------------------------
//            0,1,2,4,6,3,5,7,8,9,
//            0,1,2,4,3,6,5,7,8,9,
//            0,1,2,3,4,6,5,7,8,9,
//            --------------------------
//            0,1,2,3,4,5,6,7,8,9,
//            --------------------------
//            --------------------------

    /**
     * 冒泡排序 O(n^2) O(n) O(n^2) O(1) 稳定
     * <p/>
     * 排序思想 两两比较相邻记录
     * 最好情况：本身是有序的 比较n-1次
     * 最坏情况：本身是逆序的 比较n(n-1)/2次
     * <p/>
     * 适用于基本有序的序列或数据量小的
     *
     * @param a
     * @param <AnyType>
     */
    public static <AnyType extends Comparable<? super AnyType>> void sort(AnyType[] a) {

//        int count = 0;
        boolean flag = true;
        for (int i = 0; i < a.length && flag; i++) {
            flag = false;
            for (int j = a.length - 1 - 1; j >= i; j--) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    ArrayUtils.swapReferences(a, j, j + 1);
//                    ArrayUtils.printArray(a);
                    flag = true;
//                    count++;
                }
            }
//            System.out.println("--------------------------");
        }

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length - 1 - i; j++) {
//                if (a[j].compareTo(a[j + 1]) > 0) {
//                    ArrayUtils.swapReferences(a, j, j + 1);
//                    ArrayUtils.printArray(a);
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
    }

}
