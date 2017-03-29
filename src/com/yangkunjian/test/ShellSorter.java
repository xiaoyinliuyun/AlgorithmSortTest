package com.yangkunjian.test;

/**
 * Created by yangkunjian on 17/3/28.
 */
public class ShellSorter {
    /**
     * 希尔排序 O(n^1.25)
     *
     * @param a
     * @param <AnyType>
     */
    public static <AnyType extends Comparable<? super AnyType>> void sort(AnyType[] a) {
        int j = 0;
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                AnyType tmp = a[i];
                for (j = i; j >= gap && tmp.compareTo(a[j - gap]) < 0; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = tmp;
            }
        }
//        printArray(a);
    }
}
