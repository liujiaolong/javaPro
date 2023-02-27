package com.dragon.d2_collection.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //HashSet：添加的元素是无序，不重复，无索引
        Collection<String> c = new ArrayList<>();
        //1、添加元素，添加成功返回true
        c.add("Java");
        c.add("MySQL");
        c.add("HTML");
        c.add("Java");
        c.add("黑马");
        System.out.println(c);//[Java, MySQL, HTML, Java, 黑马]

        //2、清空集合的元素
        //list.clear();
        //System.out.println(list);//[]

        //3、判断集合是否为空，是空返回true，反之
        System.out.println(c.isEmpty());

        //4、获取集合的大小
        System.out.println(c.size());

        //5、判断集合中是否包含某个元素
        System.out.println(c.contains("Java")); //true
        System.out.println(c.contains("java")); //false,精准匹配

        //6、删除某个元素：如果有多个重复元素默认删除前面的第一个
        System.out.println(c.remove("Java"));//true
        System.out.println(c);//[MySQL, HTML, Java, 黑马]

        //7、把集合转换成数组 [Java, 独孤求败, HTML, Mybatis]
        Object[] arrs = c.toArray();
        //System.out.println(arrs);//[Ljava.lang.Object;@1b6d3586
        System.out.println("数组：" + Arrays.toString(arrs));//数组：[MySQL, HTML, Java, 黑马]

        System.out.println("----------拓展--------------");
        Collection<String> c1 = new ArrayList<>();
        c1.add("Java1");
        c1.add("Java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("赵敏");
        c2.add("殷素素");
        //addAll把c2集合的元素全部倒入到c1中去
        c1.addAll(c2);
        System.out.println(c1);//[Java1, Java2, 赵敏, 殷素素]
        System.out.println(c2);//[赵敏, 殷素素]
    }
}
