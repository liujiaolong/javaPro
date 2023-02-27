package com.dragon.d1_unchange_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    目标：不可变集合
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //1、不可变的list集合
        List<Double> lists = List.of(569.5, 700.5, 523.0, 570.5);
//        lists.add(698.0);//添加报错
//        lists.set(2 , 698.3);//修改报错
        System.out.println(lists);//[569.5, 700.5, 523.0, 570.5]

        //2、不可变的Set集合
        Set<String> names = Set.of("迪丽热巴", "古力娜扎" , "马尔扎哈");
        System.out.println(names);//[古力娜扎, 马尔扎哈, 迪丽热巴]

        //3、不可变的Map集合
        Map<String , Integer> maps = Map.of("huawei" , 2 , "Java开发" , 1);
        System.out.println(maps);//{huawei=2, Java开发=1}
    }
}
