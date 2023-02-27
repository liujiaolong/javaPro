package com.dragon.d8_binarysearch;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        //目标：学会使用选择排序的方法对数组进行排序
        int[] arr = {5, 1, 3, 2};
        //           0  1  2  3
        //定义循环控制选择几轮
        for (int i = 0; i < arr.length - 1; i++) {
            // i = 0  j = 1 2 3
            // i = 1  j = 2 3
            // i = 2  j = 2
            //定义内部循环，控制选择几次
            for (int j = i + 1; j < arr.length; j++) {
                // 当前位：arr[i]
                //如果有比当前位数据更小的，则交换
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 5]
    }
}
