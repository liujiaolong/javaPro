package com.dragon.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建ArrayList集合的对象
        ArrayList list = new ArrayList();

        //添加数据，可以任意类型
        list.add("Java");
        list.add("Java");
        list.add("Mysql");
        list.add("黑马");
        list.add(23);
        list.add(23.5);
        list.add(false);
        list.add('中');

        System.out.println(list);

        // 给指定索引位置插入元素
        list.add(1 , "PHP");

        System.out.println(list);
    }
}
