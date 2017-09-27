package com.yangkunjian.test;

/**
 * Created by yangkunjian on 17/3/28.
 */
public class QuickSorter {

    private static final int MAX_LENGTH_INSERT_SORT = 7;

    /**
     * 快速排序方法 O(nlogn) O(nlogn) O(n^2) O(logn)~O(n) 不稳定
     *
     * 对空间复杂度有要求
     *
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void sort(T[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static <T extends Comparable<? super T>> T median3(T[] a, int left, int right) {

        int center = (left + right) / 2;
        if (a[center].compareTo(a[left]) < 0) {
            swapReferences(a, left, center);
        }
        if (a[right].compareTo(a[left]) < 0) {
            swapReferences(a, left, right);
        }
        if (a[right].compareTo(a[center]) < 0) {
            swapReferences(a, center, right);
        }

        swapReferences(a, center, right - 1);
        return a[right - 1];
    }

    private static <T extends Comparable<? super T>> void swapReferences(T[] a, int left, int center) {
        T tmp = a[left];
        a[left] = a[center];
        a[center] = tmp;
    }


    private static <T extends Comparable<? super T>> void quickSort(T[] a, int left, int right) {
        if (left + MAX_LENGTH_INSERT_SORT <= right) {//7个数内 使用插入排序
            T pivot = median3(a, left, right);

            //Begin partitioning
            int i = left, j = right - 1;
            for (; ; ) {
                while (a[++i].compareTo(pivot) < 0) {
                }
                while (a[--j].compareTo(pivot) > 0) {
                }
                if (i < j) swapReferences(a, i, j);
                else break;
            }

            swapReferences(a, i, right - 1);

            quickSort(a, left, i - 1);//sort small elements
            quickSort(a, i + 1, right);//sort large elements

        } else {
            insertionSort(a, left, right);
        }
    }

    private static <T extends Comparable<? super T>> void insertionSort(T[] a, int left, int right) {
        InsertionSorter.sort(a, left, right);
    }

}
