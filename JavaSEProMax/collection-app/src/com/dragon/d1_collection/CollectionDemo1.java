package com.dragon.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
    目标：明确Collection集合体系特点
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        //有序 可重复 有索引
        Collection list = new ArrayList(); //多态写法，右边子对象给到了右边接口
        list.add("Java");
        list.add("Java");
        list.add("Mybatis");
        list.add(123);
        list.add(false);
        System.out.println(list);//[Java, Java, Mybatis, 123, false]

        //无序 不重复 无索引
        Collection list1 = new HashSet(); //多态写法，右边子对象给到了右边接口
        list1.add("Java");
        list1.add("Java");
        list1.add("Mybatis");
        list1.add(123);
        list1.add(false);
        System.out.println(list1);//[Java, false, 123, Mybatis]

        System.out.println("-------------------------");

        Collection<String> list2 = new ArrayList<>();//JDK7 开始之后后面类型申明可以不写
        list2.add("Java");
        list2.add("MySQL");
        //集合和泛型不支持基本数据类型，只能支持引用类型数据
        //Collection<int> list3 = new ArrayList<>(); //报错，不支持基本数据类型
        //如果必须要存基本数据类型，那么就需要包装类，如int -> Integer ,...
        Collection<Integer> list3 = new ArrayList<>();
        list3.add(223);

        Collection<Double> list4 = new ArrayList<>();
        //list4.add(23); //报错，装箱不能成整数
        list4.add(23.0); //装箱不能成整数
    }
}
