package com.dragon.d2_static_util;

public class TestDemo1 {
    public static void main(String[] args) {
        int[] arr = null;
        int[] arr1 = {};
        int[] arr2 = {11,22,44,89};
        System.out.println(ArrayUtil.toString(arr)); //null
        System.out.println(ArrayUtil.toString(arr1)); //[]
        System.out.println(ArrayUtil.toString(arr2)); //[11 , 22 , 24 , 89]
    }
}
