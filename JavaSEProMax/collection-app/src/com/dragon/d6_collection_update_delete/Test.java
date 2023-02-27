package com.dragon.d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("黑马");
        list.add("Java");
        list.add("Java");
        list.add("赵敏");
        list.add("赵敏");
        list.add("素素");
        System.out.println(list);//[黑马, Java, Java, 赵敏, 赵敏, 素素]
        //需求：删除全部的Java信息
        //a、迭代器遍历删除
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String ele = it.next();
            if ("Java".equals(ele)){
                //list.remove("Java");//使用集合器删除，会出现异常报错
                it.remove();//删除当前所在元素，并且不会后移
                            //使用迭代器删除当前位置元素，保证不后移
                            //能够成功遍历到全部元素
            }
        }
        System.out.println(list);//[黑马, 赵敏, 赵敏, 素素]
        //b、foreach遍历删除，不能使用，会出现bug
        for (String s : list) {
            if ("Java".equals(s)){
                //list.remove("Java");//会出现异常

            }
        }
        //c、lambda 表达式，不能使用，会出现bug
        list.forEach(s -> {
            //list.remove("Java");//会出现异常
        });
        //d、for循环(不会出现异常错误，但是数据删除出现了问题，会漏掉元素)
        //方案一：
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            if ("Java".equals(ele)){
                list.remove("Java");
                i--;//每次删除成功后，回退到上一步
            }
        }
        System.out.println(list);//[黑马, 赵敏, 赵敏, 素素]
        //方案二：
        for (int i = list.size() -1 ; i >= 0; i--){
            String ele = list.get(i);
            if ("Java".equals(ele)){
                list.remove("Java");
            }
        }
        System.out.println(list);//[黑马, 赵敏, 赵敏, 素素]
    }
}
