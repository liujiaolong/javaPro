package com.dragon.d1_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        // 看看Set系列集合的特点：HashSet 、 LinkedHashSet 、 TreeSet

        // HashSet：无序不重复，无索引
        Set<String> sets = new HashSet<>(); //多态写法，因为HashSet也是属于Set集合家族
        sets.add("MySql");
        sets.add("MySql");                             //类似：List<String> list = new ArrayList<>();
        sets.add("Java");
        sets.add("Java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets);//[Java, MySql, HTML, SpringBoot]

        System.out.println("----------");

        // LinkedHashSet：有序，无索引，不重复
        Set<String> sets2 = new LinkedHashSet<>();
        sets2.add("MySql");
        sets2.add("MySql");
        sets2.add("Java");
        sets2.add("Java");
        sets2.add("HTML");
        sets2.add("HTML");
        sets2.add("SpringBoot");
        sets2.add("SpringBoot");
        System.out.println(sets2);//[MySql, Java, HTML, SpringBoot]
    }
}
