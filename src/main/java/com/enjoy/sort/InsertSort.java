package com.enjoy.sort;

import java.util.Arrays;

/**
 * @ClassName: InsertSort
 * @Description: TODO
 * @author: 陈晓勇
 * @date: 2021/11/28  12:12
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 322, 3, 44, 6, 87, 61};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 插入排序:通过构建有序序列，对于未排序数据，在已排序的序列中从右向左扫描，找到相应的位置并插入
     * 最坏情况：O(n^2) 最好情况O(n)
     *
     * @param arr
     */
    static void sort(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            //存储要插入的值
            int temp = arr[i + 1];
            //选择开始比较的位置
            int index = i;
            //如果插入的数temp比被插入的位置的数arr[index]小
            while (index >= 0 && temp < arr[index]) {
                //把 arr[index] 向右移动
                arr[index + 1] = arr[index];
                //让 index 向左移动
                index--;
            }
            //把插入的数放入合适位置
            arr[index + 1] = temp;
        }
    }
}
