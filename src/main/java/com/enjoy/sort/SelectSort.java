package com.enjoy.sort;

import java.util.Arrays;

/**
 * @ClassName: SelectSort
 * @Description: 选择排序
 * @author: 陈晓勇
 * @date: 2021/11/28  11:44
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 322, 3, 44, 6, 87, 61};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    /**
     * 选择排序:在一个长度为 N 的无序数组中，第一次遍历 n-1 个数，找到最小的和第一个数交换
     * 第二次从下一个数开始遍历 n-2 个数，找到最小的数和第二个数交换
     * 重复以上操作直到第 n-1 次遍历最小的数和第 n-1 个数交换，排序完成
     * 双重循环时间 O(n^2)
     *
     * @param arr
     */
    static void sort(int[] arr) {
        int len = arr.length;
        //外循环控制循环次数
        for (int i = 0; i < len - 1; i++) {
            //选择第i个作为最小元素
            int min = arr[i];
            //内循环控制每次比较的次数
            for (int j = i + 1; j < len; j++) {
                //每轮将后面的数与最小值比较
                if (min > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = min;
                    min = arr[i];
                }
            }
        }

    }
}
