package com.dragon;

import java.util.Scanner;

//数字加密
public class ShuZiJiaMi {
    public static void main(String[] args) {
        System.out.println("请您输入需要加密的数字个数：");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length]; //动态初始化数字
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请您录入加密的第" + (i+1) +"个数字");
            int number = sc.nextInt();
            arr[i] = number;
        }
        printArray(arr); //打印数组看下数据准确性

        //对数组中的数据进行加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10; //重新赋值
        }
        printArray(arr); //打印数组看下数据准确性

        //对数组中的数据进行翻转，才是最终结果 arr = [6, 4, 3, 8]
        //                                           i       j
        for (int i = 0, j = arr.length -1 ; i < j; i++ , j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    //打印数组
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
