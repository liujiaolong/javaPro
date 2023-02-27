package com.dragon.d9_lambda;

import com.dragon.d7_arrays.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        //目标：自定义数组排序规则：Comparator比较器对象
        //需求：降序排序!(自定义比较器对象，只能支持引用类型的排序~~)
        Integer[] ages = {34, 12, 42, 23};
        /**
         *  参数一：被排序的数组 必须是引用类型的元素
         *  参数二：匿名内部类对象，代表了一个比较器对象
         */
        //标准
//            Arrays.sort(ages, new Comparator<Integer>() {
//                @Override
//                public int compare(Integer o1, Integer o2) {
//                    return o2 - o1; //负数是降序，或者可以写成 o2 - o1
//                }
//            });
        //简化
//        Arrays.sort(ages, (Integer o1, Integer o2) -> {
//            return o2 - o1; //负数是降序，或者可以写成 o2 - o1
//        });
        //更简化
//        Arrays.sort(ages, (o1 , o2) -> {
//            return o2 - o1; //负数是降序，或者可以写成 o2 - o1
//        });
        //更更简化
        Arrays.sort(ages, (o1 , o2) -> o2 - o1 );

        System.out.println(Arrays.toString(ages));

        System.out.println("--------------------");

        JFrame win = new JFrame("登录界面");
        JButton btn = new JButton("我是一个很大的按钮");
        //标准
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("有人点我，点我，点我");
//            }
//        });
        //简化
//        btn.addActionListener((ActionEvent e) ->{
//            System.out.println("有人点我，点我，点我");
//        });
//        //更简化
//        btn.addActionListener( e ->{
//            System.out.println("有人点我，点我，点我");
//        });

        //更更简化
        btn.addActionListener( e -> System.out.println("有人点我，点我，点我"));

        win.add(btn);
        win.setSize(400 , 300);
        win.setVisible(true);
    }
}
