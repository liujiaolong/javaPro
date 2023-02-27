package com.dragon.d7_arrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //学会使用Arrays类的常用Api，并理解其原理
        int[] arr = {10,2,55,23,24};
        System.out.println(arr);//[I@1b6d3586
        //1、返回数组内容的toString(数组)
        String res = Arrays.toString(arr);
        System.out.println(res);//[10, 2, 55, 23, 24]

        //2、排序的API(默认自动对数组元素进行升序排序)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //3、二分搜索技术（前提数组必须排好序才支持，否则出bug）
        //返回不存在元素的规律：- (应该插入的位置 + 1)
        int index = Arrays.binarySearch(arr , 55);
        System.out.println(index);

        //如果不进行排序就使用二分搜索会产生什么情况
        //注意：数组如果排好序，可能会找不到存在的元素，从而出现bug
        int[] arr2 = {12,36,34,25,11,356,100};
        System.out.println(Arrays.binarySearch(arr2 , 36));
    }
}
