package com.enjoy.sort;

import java.util.Arrays;

/**
 * @ClassName: MergeSort
 * @Description: TODO
 * @author: 陈晓勇
 * @date: 2021/12/4  10:45
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {2, 4, 322, 3, 44, 6, 87, 61};
        int[] sort = sort(arr);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] arr) {
        if (arr.length <= 2) {
            if (arr.length == 1) {
                return arr;
            }
            if (arr[0] > arr[1]) {
                int temp = arr[1];
                arr[1] = arr[0];
                arr[0] = temp;
            }
            return arr;
        } else {
            int mid = arr.length / 2;
            int[] leftArr = Arrays.copyOf(arr, mid);
            int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);

            return merge(sort(leftArr), sort(rightArr));
        }

    }

    private static int[] merge(int[] leftArr, int[] rightArr) {
        int[] resultArr = new int[leftArr.length + rightArr.length];
        for (int index = 0, left = 0, right = 0; index < resultArr.length; index++) {
            if (left >= leftArr.length) {
                //说明leftArr遍历结束了
                resultArr[index] = rightArr[right];
                right++;
            } else if (right >= rightArr.length) {
                //说明rightArr遍历结束了
                resultArr[index] = leftArr[left];
                left++;
            } else if (leftArr[left] >= rightArr[right]) {
                resultArr[index] = rightArr[right];
                right++;
            } else {
                resultArr[index] = leftArr[left];
                left++;
            }
        }

        return resultArr;
    }
}
