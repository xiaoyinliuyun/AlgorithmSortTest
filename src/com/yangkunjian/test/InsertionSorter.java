package com.yangkunjian.test;

/**
 * Created by yangkunjian on 17/3/28.
 */
public class InsertionSorter {

//            4,6,2,1,7,9,8,0,5,3,
//            4,6,2,1,7,9,8,0,5,3,
//            2,4,6,1,7,9,8,0,5,3,
//            1,2,4,6,7,9,8,0,5,3,
//            1,2,4,6,7,9,8,0,5,3,
//            1,2,4,6,7,9,8,0,5,3,
//            1,2,4,6,7,8,9,0,5,3,
//            0,1,2,4,6,7,8,9,5,3,
//            0,1,2,4,5,6,7,8,9,3,
//            0,1,2,3,4,5,6,7,8,9,

    /**
     * 插入排序 O(n^2) O(n) O(n^2)
     * 最好的情况:要排序的表本身就是有序的 比较n-1次 移动0次
     * 最坏的情况:待排序表是逆序的 比较（n+2)(n-1)/2次 移动（n+4)(n-1)/2次
     * 随机情况:平均比较和移动次数 (n^2)/4
     *
     * 直接插入排序比冒泡和简单选择排序的性能要好一些
     *
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void sort(T[] a) {
        ArrayUtils.printArray(a);
        int j = 0;
        for (int p = 1; p < a.length; p++) {
            T tmp = a[p];
            for (j = p; j > 0 && tmp.compareTo(a[j - 1]) < 0; j--) {
                a[j] = a[j - 1];
            }
            a[j] = tmp;
//            ArrayUtils.printArray(a);
        }
    }

    public static <T extends Comparable<? super T>> void sort(T[] a, int left, int right) {
        int j = 0;
        for (int p = left + 1; p < right + 1; p++) {
            T tmp = a[p];
            for (j = p; j > left && tmp.compareTo(a[j - 1]) < 0; j--) {
                a[j] = a[j - 1];
            }
            a[j] = tmp;
        }

        ArrayUtils.printArray(a);
    }

}
