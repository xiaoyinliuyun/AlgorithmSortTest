package com.yangkunjian.test;

import java.util.Arrays;
import java.util.Random;

public class Main {


    /**
     * N = 100000
     * <p/>
     * 插入排序：4850
     * 希尔排序：34
     * 简单选择排序：9615
     * 堆排序：34
     * 冒泡排序：36269
     * 快速排序：153
     * 快速排序官方：109
     * 归并排序：86
     *
     * @param args
     */
    public static void main(String[] args) {


//        Integer[] datas2 = random();
//        long start2 = System.currentTimeMillis();
//        InsertionSorter.sort(datas2);
//        long end2 = System.currentTimeMillis();
//        System.out.println("插入排序：" + String.valueOf(end2 - start2));
//
//        Integer[] datas1 = random();
//        long start1 = System.currentTimeMillis();
//        ShellSorter.sort(datas1);
//        long end1 = System.currentTimeMillis();
//        System.out.println("希尔排序：" + String.valueOf(end1 - start1));
//
//        Integer[] datas7 = random();
        Integer[] datas7 = new Integer[]{4, 6, 2, 1, 7, 9, 8, 0, 5, 3};
        long start7 = System.currentTimeMillis();
        SimpleSelectSorter.sort(datas7);
        long end7 = System.currentTimeMillis();
        System.out.println("简单选择排序：" + String.valueOf(end7 - start7));
//
//        Integer[] datas3 = random();
//        long start3 = System.currentTimeMillis();
//        HeapSorter.sort(datas3);
//        long end3 = System.currentTimeMillis();
//        System.out.println("堆排序：" + String.valueOf(end3 - start3));
//
//        Integer[] data0 = random();
//        Integer[] data0 = new Integer[]{4, 6, 2, 1, 7, 9, 8, 0, 5, 3};
////        Integer[] data0 = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
////        Integer[] data0 = new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
////        ArrayUtils.printArray(data0);
//        long start0 = System.currentTimeMillis();
//        BubbleSorter.sort(data0);
//        long end0 = System.currentTimeMillis();
//        System.out.println("冒泡排序：" + String.valueOf(end0 - start0));
//
//        Integer[] data6 = random();
//        long start6 = System.currentTimeMillis();
//        Arrays.sort(data6);
//        long end6 = System.currentTimeMillis();
//        System.out.println("快速排序：" + String.valueOf(end6 - start6));
//
//        Integer[] data4 = random();
//        long start4 = System.currentTimeMillis();
//        Arrays.sort(data4);
//        long end4 = System.currentTimeMillis();
//        System.out.println("快速排序官方：" + String.valueOf(end4 - start4));
//
//        Integer[] data5 = random();
//        long start5 = System.currentTimeMillis();
//        MergeSorter.sort(data5);
//        long end5 = System.currentTimeMillis();
//        System.out.println("归并排序：" + String.valueOf(end5 - start5));
//
//
//        Integer[] datas = new Integer[]{4, 6, 2, 1, 7, 9, 8, 0, 5, 3};
//        InsertionSorter.sort(datas, 3, 7);
    }

    private static final int N = 1000000;

    public static Integer[] random() {
        Integer[] int_array = new Integer[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            int_array[i] = random.nextInt(N);
        }
        return int_array;
    }
}
