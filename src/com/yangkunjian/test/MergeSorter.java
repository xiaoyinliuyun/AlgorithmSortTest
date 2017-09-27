package com.yangkunjian.test;

/**
 * Created by yangkunjian on 17/3/28.
 */
public class MergeSorter {

    /**
     * 归并排序方法 O(nlogn) O(nlogn) O(nlogn) O(n) 稳定
     *
     * 对空间复杂度有要求
     *
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void sort(T[] a) {
        T[] tmpArray = (T[]) new Comparable[a.length];

        mergeSort(a, tmpArray, 0, a.length - 1);
    }

    private static <T extends Comparable<? super T>> void mergeSort(T[] a, T[] tmpArray, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tmpArray, left, center);
            mergeSort(a, tmpArray, center + 1, right);
            merge(a, tmpArray, left, center + 1, right);
        }
    }

    private static <T extends Comparable<? super T>> void merge(T[] a, T[] tmpArray, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        //Main loop
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (a[leftPos].compareTo(a[rightPos]) <= 0) {
                tmpArray[tmpPos++] = a[leftPos++];
            } else {
                tmpArray[tmpPos++] = a[rightPos++];
            }
        }

        while (leftPos <= leftEnd) {//拷贝上一半的副本
            tmpArray[tmpPos++] = a[leftPos++];
        }

        while (rightPos <= rightEnd) {//拷贝另一半的副本
            tmpArray[tmpPos++] = a[rightPos++];
        }

        for (int i = 0; i < numElements; i++, rightEnd--) {
            a[rightEnd] = tmpArray[rightEnd];
        }
    }


}
