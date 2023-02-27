package com.dragon.arraylist;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        //创建一个ArrayList集合存储一个班级学生的成绩
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);

        //把低于80分的成绩从集合中去掉
        //scores = [98, 77, 66, 89, 79, 50, 100]

        //*******有毛病的代码，有bug******************//
        //错位导致删除有bug
//        for (int i = 0; i < scores.size(); i++) {
//            int score = scores.get(i);
//            if (score < 80){
//                //这个分数必须删除
//                scores.remove(i);
//            }
//        }
//        System.out.println(scores); //[98, 66, 89, 50, 100]
        //*******************************************//

        //完美解决方案一
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score < 80){
                //这个分数必须删除
                scores.remove(i);
                i--; //注意：删除成功后，必须退一步，这样可以保证下次回到这个位置，如此不会调过数据
            }
        }
        System.out.println(scores); //[98, 89, 100]


        //完美解决方案二
        //从后面倒着遍历删除就可以，类似lua语言 table.remove()，倒着删除元素
        for (int i = scores.size() - 1; i >= 0; i--) {
            int score = scores.get(i);
            if (score < 80){
                scores.remove(i);
            }
        }
        System.out.println(scores); //[98, 89, 100]
    }
}
