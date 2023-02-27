package com.dragon.d3_static_code;

import java.util.ArrayList;

public class StaticDemo2 {
    /**
     *  1、定义一个静态集合，这样这个集合只会加载一个，因为系统也只需要一副牌
     */
    public static ArrayList<String> cards = new ArrayList<>();

    /**
     *  2、在程序真正运行main方法前，把54张牌放进去，后续游戏就可以直接使用了
     */
    static {
        //3、正式做牌，放到集合中去
        //定义一个数组全部点数，类型确定了，个数确定了
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♥","♠","♦","♣"};
        for (int i = 0; i < sizes.length; i++) {
            //遍历花色
            for (int j = 0; j < colors.length; j++) {
                String card = sizes[i] + colors[j];
                cards.add(card);//放入到集合中
            }
        }
        //单独加入大小王
        cards.add("大王");
        cards.add("小王");

    }
    public static void main(String[] args) {
        //模拟游戏启动前初始化54张牌数据
        System.out.println("新牌：" + cards);
    }
}
