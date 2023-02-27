package com.dragon;

//数组复制
public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33,44};
//        int[] arr2 = arr1; //没有完成数组复制，因为指向同一个地址
        int[] arr2 = new int[arr1.length]; //动态生成数组大小
        copy(arr1 , arr2);
        System.out.println(arr1);
        printArray(arr1);
        System.out.println(arr2);
        printArray(arr2);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    public static void copy(int[] arr1 , int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
}
