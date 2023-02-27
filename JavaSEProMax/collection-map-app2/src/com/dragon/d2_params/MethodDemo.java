package com.dragon.d2_params;

import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {

        sum();//不传参
        sum(10);//可以传输一个参数
        sum(10 ,20 , 30); //可以传输多个参数
        sum(new int[]{10 , 20 , 30 , 40 , 50}); //可以传输一个数组
    }
    /*
        注意：一个形参列表中只能有一个可变参数
            可变参数必须放在形参列表的最后面
             如：sum(10 , 44,55,66)
                 public static void sum(int age , int...nums){}
     */
    public static void sum(int...nums){
        //注意：可变参数在方法内部其实就是数组 nums
        System.out.println("元素个数：" + nums.length);
        System.out.println("元素内容：" + Arrays.toString(nums));
    }
}
