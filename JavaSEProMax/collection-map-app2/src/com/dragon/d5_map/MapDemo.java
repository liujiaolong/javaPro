package com.dragon.d5_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //目标：认识Map的特点：按照键无序，不重复，无索引，值不做要求
        System.out.println("------HashMap-----");
        Map<String , Integer> maps = new HashMap<>();//一行经典代码，多态写法
        maps.put("鸿星尔克" , 3);
        maps.put("Java" , 1);
        maps.put("枸杞" , 100);
        maps.put("Java" , 100); //会覆盖前面Java的数据
        maps.put(null , null);
        System.out.println(maps);//{null=null, Java=100, 枸杞=100, 鸿星尔克=3}

        System.out.println("------LinkedHashMap-----");
        Map<String , Integer> maps2 = new LinkedHashMap<>();
        maps2.put("鸿星尔克" , 3);
        maps2.put("Java" , 1);
        maps2.put("枸杞" , 100);
        maps2.put("Java" , 100); //会覆盖前面Java的数据
        maps2.put(null , null);
        System.out.println(maps2);//{鸿星尔克=3, Java=100, 枸杞=100, null=null}

    }
}
