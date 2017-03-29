package com.yangkunjian.test;

/**
 * Created by yangkunjian on 17/3/29.
 */
public class SimpleSelectSorter {

//            0,6,2,1,7,9,8,4,5,3,
//            0,1,2,6,7,9,8,4,5,3,
//            0,1,2,6,7,9,8,4,5,3,
//            0,1,2,3,7,9,8,4,5,6,
//            0,1,2,3,4,9,8,7,5,6,
//            0,1,2,3,4,5,8,7,9,6,
//            0,1,2,3,4,5,6,7,9,8,
//            0,1,2,3,4,5,6,7,9,8,
//            0,1,2,3,4,5,6,7,8,9,
//            0,1,2,3,4,5,6,7,8,9,

    /**
     * 简单选择排序 O(n^2) O(n^2) O(n^2) O(1) 稳定
     * <p/>
     * 基本思想 每一趟在 n - i + 1 (i = 1,2,...,n-1) 个记录中选取关键字最小的记录作为 有序序列的第i个记录
     * <p/>
     * 特点 交换移动的数据相当少 性能上略优于冒泡排序
     *      关键字信息量较大时，优势明显（因为移动的次数少）
     * <p/>
     * 比较：第i趟排序需要进行n-i次关键字的比较 无论最好最差情况比较次数一样多 n(n-1)/2次
     * 交换：最好的时候交换 0 次 最差的时候交换 n-1次
     *
     * @param a
     * @param <AnyType>
     */
    public static <AnyType extends Comparable<? super AnyType>> void sort(AnyType[] a) {

        for (int i = 0, min = 0; i < a.length; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min].compareTo(a[j]) > 0) {
                    min = j;
                }
            }
            if (i != min) {
                ArrayUtils.swapReferences(a, i, min);
            }
//            ArrayUtils.printArray(a);
        }
    }

}
