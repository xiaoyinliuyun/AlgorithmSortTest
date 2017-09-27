package com.yangkunjian.test;

/**
 * Created by yangkunjian on 17/3/28.
 */
public class ArrayUtils {

    public static void exchangeElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <T extends Comparable<? super T>> void swapReferences(T[] a, int i, int i1) {
        T temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;
    }

    public static <T extends Comparable<? super T>> void printArray(T[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

}
