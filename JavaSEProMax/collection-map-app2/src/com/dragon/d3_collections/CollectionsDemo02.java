package com.dragon.d3_collections;

import com.dragon.d1_set.Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo02 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(); //可以重复
        Collections.addAll(apples,
                new com.dragon.d1_set.Apple("红富士" , "红色" , 9.9 , 500) ,
                new com.dragon.d1_set.Apple("青苹果" , "绿色" , 15.9 , 300),
                new com.dragon.d1_set.Apple("绿苹果" , "青色" , 29.9 , 400),
                new Apple("黄苹果" , "黄色" , 9.8 , 500)
        );
        //方式一
        //Collections.sort(apples); //可以的，Apple类已经重写了比较规则

        //方式二排序：sort自带比较器对象
        Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                //按照价格排序
                return Double.compare(o1.getPrice() , o2.getPrice());
            }
        });
        System.out.println(apples);

    }
}
