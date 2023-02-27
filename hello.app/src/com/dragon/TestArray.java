package com.dragon;

import java.util.Random;
import java.util.Scanner;

public class TestArray {


    public static void main(String[] args) {
        //数组
        //学会静态初始化的方式定义数组
        //数据类型[]  数组名 = new 数据类型[]{元素1，元素2，元素3...}
//    double[] score = new double[]{99.5,88.5,70.0};
//    int[] ages = new int[]{22,14,36};
//    String[] names = new String[]{"牛二","小明"};
//
//    //简化格式
//    double[] score2 = {99.5,88.5,70.0};
//    int[] ages2 = {22,14,36};
//    String[] names2 = {"牛二","小明"};
//        int[] ages = {12,22,45};
//        //取值：数组名称[索引]
//        System.out.println(ages[2]);
//        //赋值：数组名称[索引] = 数据;
//        ages[2] = 100;
//        //访问数组的长度
//        int len = ages.length;
//        System.out.println(len);

//        double[] scores = new double[3]; // 默认 [0.0,0.0,0.0]
//        //                                    0 , 1 , 2
//        //赋值
//        scores[0] = 99.5;
//        System.out.println(scores[0]);//99.5
//        System.out.println(scores[2]);//0.0
//
//        String[] names = new String[90];
//        names[0] = "迪丽热巴";
//        names[2] = "马尔扎哈";
//        System.out.println(names[0]);
//        System.out.println(names[1]); //null
//        System.out.println(names[2]);

//        int[] arr = {12,24,48};
//        //原始遍历方式
////        System.out.println(arr[0]);
////        System.out.println(arr[1]);
////        System.out.println(arr[2]);
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//        int[] money = {16,32,8,100,78};
//        int sum = 0;
//        for (int i = 0; i < money.length; i++) {
//            sum += money[i];
//        }
//        System.out.println("总销售额是：" + sum);
        int[] faceScore = {15,9000,10000,20000,9500,-5};
//        int max = 0;
        int max = faceScore[0]; //建议使用第一个元素作为参照
        for (int i = 1; i < faceScore.length; i++) {
            if (max < faceScore[i]){
                max = faceScore[i];
            }
        }
        System.out.println("最大值为：" + max);
//        int[] datas = new int[5];
//        Random r = new Random();
//        for (int i = 0; i < datas.length; i++) {
//            datas[i] = r.nextInt(20) + 1; //减加法
//        }
//        Scanner sc = new Scanner(System.in);
//        OUT:
//        while (true){
//            System.out.println("请输入一个1-20之间的整数进行猜测：");
//            int guessData = sc.nextInt();
//            for (int i = 0; i < datas.length; i++) {
//                if (datas[i] == guessData){
//                    System.out.println("您已经猜中了该数据，运气不错！您猜中的数据索引是：" + i);
//                    break OUT; //结束了整个死循环，代表游戏结束
//                }
//            }
//            System.out.println("当前猜测的数据在数组中不存在，青重新猜测");
//        }
//        for (int i = 0; i < datas.length; i++) {
//            System.out.print(datas[i] + "\n");
//        }
//        int[] codes = new int[5];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < codes.length; i++) {
//            System.out.println("请您输入第" + (i + 1) + "个员工工号");
//            int code = sc.nextInt();
//            codes[i] = code;
//        }
//        Random r = new Random();
//        for (int i = 0; i < codes.length; i++) {
//            int idx = r.nextInt(codes.length);
//            int temp = codes[idx];
//            codes[idx] = codes[i];
//            codes[i] = temp;
//        }
//        for (int i = 0; i < codes.length; i++) {
//            System.out.print(codes[i] + "\n");
//        }
//        int[] arr = {5,2,3,1};
//        //定义轮数
//        for (int i = 0; i < arr.length; i++) {
//            //定义一个循环控制每轮比较次数，占位
//            for (int j = 0; j < arr.length -i - 1 ; j++) {
//                if (arr[j] > arr[j + 1]){
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }

//        int a = 12;
//        System.out.println(a);
//
//        int[] arr = {11,22,33};
//        System.out.println(arr);
//
//        arr[0] = 44;
//        arr[1] = 55;
//        arr[2] = 66;
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

//        int[] arr1 = {11,22,33};
//        int[] arr2 = arr1;
//
//        System.out.println(arr1); //[I@1b6d3586
//        System.out.println(arr2); //[I@1b6d3586
//
//        arr2[1] = 99;
//        System.out.println(arr1[1]); //99
//        System.out.println(arr2[1]); //99

//        int[] arr = {11,22,33};
////        System.out.println(arr[3]);
//
//        arr = null;
//        System.out.println(arr); //null
//        System.out.println(arr.length);

    }
}
