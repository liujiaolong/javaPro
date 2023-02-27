package com.dragon.d4_constant;

import java.util.Scanner;

/**
 * 目标：学会常量的使用，并理解常量
 */
public class ConstantDemo1 {
    //定义常量
//    public static final String SCHOOL_NAME = "传智教育";
//    public static final String USER_NAME = "admin";
//    public static final String PASS_WORD = "123456";
//
//    public static void main(String[] args) {
//        System.out.println(SCHOOL_NAME);
//        if (USER_NAME.equals("admin")){}
//    }
    public static final int UP = 1; //上
    public static final int DOWN = 2; //下
    public static final int LEFT = 3; //左
    public static final int RIGHT = 4; //右

    public static void main(String[] args) {
        //通过键盘录入方法，模拟超级玛丽上下左右键
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入上下左右键盘：1上，2下，3左，4右：");
        int flag = sc.nextInt();
        move(flag);
    }

    public static void move(int flag){
        switch (flag){
            case UP:
                System.out.println("向上");
                break;
            case DOWN:
                System.out.println("向下");
                break;
            case LEFT:
                System.out.println("向左");
                break;
            case RIGHT:
                System.out.println("向右");
                break;
        }
    }
}
