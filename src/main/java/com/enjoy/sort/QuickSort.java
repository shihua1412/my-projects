package com.enjoy.sort;

import java.util.Arrays;

/**
 * @ClassName: QuickSort
 * @Description: TODO
 * @author: 陈晓勇
 * @date: 2021/11/28  11:54
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {2, 4, 322, 3, 44, 6, 87, 61};
        /*
        快速排序流程：
        (1) 从数列中挑出一个基准值。
        (2) 将所有比基准值小的摆放在基准前面，所有比基准值大的摆在基准的后面(相同的数可以到任一边)；在这个分区退出之后，该基准就处于数列的中间位置。
        (3) 递归地把"基准值前面的子数列"和"基准值后面的子数列"进行排序。
        */
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


    /**
     * 快速排序:选择一个基准数，通过一趟排序将要排序的数据分割成独立的两部分；其中一部分的所有数据都比另外一部分的所有数据都要小。
     * 然后，再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列
     * 最优的情况下时间复杂度为：O( nlogn )
     * 最差的情况下时间复杂度为：O( n^2 )
     *
     * @param arr
     * @param leftIndex  要排序的区间左
     * @param rightIndex 要排序的区间右
     * @return
     */
    static void sort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        }

        int left = leftIndex;//左指针
        int right = rightIndex;//右指针
        //待排序的第一个元素作为基准值
        int basicValue = arr[leftIndex];
        //从左右两边交替扫描，直到left = right
        while (left < right) {
            //从右往左扫描，找到第一个比基准值小的元素
            while (right > left && arr[right] >= basicValue) {
                right--;
            }
            //找到这种元素将arr[right]放入arr[left]中
            arr[left] = arr[right];

            //从左往右扫描，找到第一个比基准值大的元素
            while (left < right && arr[left] <= basicValue) {
                left++;
            }
            //找到这种元素将arr[left]放入arr[right]中
            arr[right] = arr[left];
        }
        //基准值归位
        arr[left] = basicValue;
        //对基准值左边的元素进行递归排序
        sort(arr, leftIndex, left - 1);
        //对基准值右边的元素进行递归排序
        sort(arr, right + 1, rightIndex);

    }
}
