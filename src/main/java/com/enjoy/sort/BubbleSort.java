package com.enjoy.sort;

import java.util.Arrays;

/**
 * @ClassName: BubbleSort
 * @Description: 冒泡排序
 * @author: 陈晓勇
 * @date: 2021/11/28  11:39
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 322, 3, 44, 6, 87, 61};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 冒泡排序:比较前后相邻的两个数据，如果前面数据大于后面的数据，就将这二个数据交换
     * 第一轮比较结束后：最后一个是最大的
     * 双重循环时间 O(n^2)
     *
     * @param arr
     */
    static void sort(int[] arr) {
        int len = arr.length;
        //外循环控制循环次数
        for (int i = 0; i < len - 1; i++) {
            //内循环控制每次比较的次数
            for (int j = 0; j < len - 1 - i; j++) {
                //比较相邻两个数的大小
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
