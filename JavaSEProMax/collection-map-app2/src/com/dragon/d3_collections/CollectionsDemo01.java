package com.dragon.d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
    目标：Collections工具类的使用
    java.utils.Collections:是集合工具类
    Collections有几个常用的APi：
        public static <T> boolean addAll(Collection<? super T> c , T... elements)：给集合批量添加元素
        public static void shuffle(List<?> list)：打乱集合顺序
        public static <T> void sort(List<T> list)：将集合中元素按照默认规则排序
        public static <T> void sort(List<T> list , Comparator<? Super T> c)：将集合中的元素按照指定规则排序
 */
public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
//        names.add("楚留香");
//        names.add("胡铁花");
//        names.add("张无忌");
//        names.add("陆小凤");
        //1、批量添加元素，和上面4个names.add(xxx)一样
        Collections.addAll(names , "楚留香" , "胡铁花" , "张无忌" , "陆小凤");
        System.out.println(names);

        //2、打乱集合顺序
        Collections.shuffle(names);
        System.out.println(names);

        //3、public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。（排值特性的元素）
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list , 12,23,2,4);
        Collections.sort(list);
        System.out.println(list);//[2, 4, 12, 23]

        //4、自定义对象如何进行排序
    }
}
