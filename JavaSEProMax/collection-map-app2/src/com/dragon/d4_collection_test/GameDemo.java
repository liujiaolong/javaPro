package com.dragon.d4_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*

    功能：
        1、做牌
        2、洗牌
        3、定义3个玩家
        4、发牌
        5、排序（拓展 了解 作业）
        6、看牌
 */
public class GameDemo {
    /*
        1、定义静态集合存储54张牌对象
     */
    public static List<Card> allCards = new ArrayList<>(); //经典多态格式

    /*
        2、做牌 ： 定义静态代码块和初始化数据
     */
    static {
        //3、定义点数：个数确定，类型确定，使用数组
        String[] sizes = {"3" , "4" , "5" , "6" ,"7" , "8" , "9" , "10" , "J" , "Q" , "K" , "A" , "2"};
        //4、定义花色：个数确定，类型确定，使用数组
        String[] colors = {"♠" , "♥" , "♣" , "♦"};
        //5、组合点数和花色
        int index = 0;//纪录牌的大小
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                //6、封装成一个牌对象
                Card c = new Card(size , color , index);
                //7、存入到集合容器中去
                allCards.add(c);
            }
        }
        //8、大小王存储到集合对象中去
        Card c1 = new Card("" , "小王" , ++index);
        Card c2 = new Card("" , "大王" , ++index);
        Collections.addAll(allCards , c1 , c2);//批量加入到集合容器中去
        System.out.println("新牌" + allCards);
    }
    public static void main(String[] args) {
        //9、洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后" + allCards);

        //10、发牌 (定义三个玩家，每个玩家的牌也是一个集合容器)
        List<Card> linhuchong = new ArrayList<>();
        List<Card> jiumozhi = new ArrayList<>();
        List<Card> renyingying = new ArrayList<>();

        //11、真正开始发牌（从牌集合中发出51张牌给玩家，剩余3张作为底牌）
        for (int i = 0; i < allCards.size() - 3; i++) {
            //先拿到当前牌对象
            Card c = allCards.get(i);
            //轮询算法 求余 % 3
            if (i % 3 == 0){ //第一张牌
                //请阿冲接牌
                linhuchong.add(c);
            }else if (i % 3 == 1){ //第二张牌
                //请阿鸠接牌
                jiumozhi.add(c);
            }else if (i % 3 == 2){//第三张牌
                //请盈盈接牌
                renyingying.add(c);
            }
        }
        //12、拿到最后三张牌(把最后三张牌截取成一个子集合)
        List<Card> lastTreeCards = allCards.subList(allCards.size() - 3 , allCards.size());

        //13、给玩家的牌进行排序（从大到小）
        sortCards(linhuchong);
        sortCards(jiumozhi);
        sortCards(renyingying);

        //14、输出玩家的牌
        System.out.println("阿冲：" + linhuchong);
        System.out.println("阿鸠：" + jiumozhi);
        System.out.println("盈盈：" + renyingying);
        System.out.println("最后三张底牌：" + lastTreeCards);

    }

    /*
        给牌进行排序
     */
    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getIndex() - o1.getIndex();
            }
        });
    }
}
