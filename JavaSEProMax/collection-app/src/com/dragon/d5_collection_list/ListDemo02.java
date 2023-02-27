package com.dragon.d5_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Java1");
        lists.add("Java2");
        lists.add("Java3");

        /** for 循环*/
        System.out.println("--------------for-----------");
        for (int i = 0; i < lists.size(); i++) {
            //lists[i] 报错，因为不是数组
            String ele = lists.get(i);
            System.out.println(ele);
        }

        /** 迭代器*/
        System.out.println("-----------Iterator--------------");
        Iterator<String> it = lists.iterator();
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }

        /** foreach*/
        System.out.println("------------foreach---------------");
        for (String ele : lists) {
            System.out.println(ele);
        }

        /** JDK 1.8开始之后的Lambda表达式*/
        System.out.println("------------Lambda表达式---------------");
        lists.forEach(s ->{
            System.out.println(s);
        });
    }
}
