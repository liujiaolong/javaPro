package com.dragon.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //能够使用泛型约束ArrayList集合操作的数据类型
//        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>(); //JDK 1.7 开始，泛型后面的类型声明可以不写
        list.add("Java");
        list.add("PHP");
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(10);
        System.out.println(list2);

        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(1.5);
        System.out.println(list3);
    }
}
