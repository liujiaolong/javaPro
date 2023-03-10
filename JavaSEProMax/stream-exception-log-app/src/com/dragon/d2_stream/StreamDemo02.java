package com.dragon.d2_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo02 {
    public static void main(String[] args) {
        /************Collection集合获取流*****************/
        Collection<String> lists = new ArrayList<>();
        Stream<String> s = lists.stream();
        /************Map集合获取流*****************/
        Map<String , Integer> maps = new HashMap<>();
        // 键流
        Stream<String> keyStream = maps.keySet().stream();
        //值流
        Stream<Integer> valueStream = maps.values().stream();
        //键值对流(拿整体)
        Stream<Map.Entry<String , Integer>> keyAndValueStream = maps.entrySet().stream();
        /************数组获取流*****************/
        String[] names = {"赵敏" , "小赵" , "灭绝"};
        Stream<String> nameStream = Arrays.stream(names);
        System.out.println(nameStream);

        Stream<String> nameStream2 = Stream.of(names);

    }
}
