package com.dragon.d5_enum;

import java.util.Scanner;

/**
 * 目标：学会枚举的使用，并理解枚举
 */
public class EnumDemo {
    public static void main(String[] args) {
        //模拟通过键盘录入方法，模拟超级玛丽上下左右键
        move(Orientation.UP);
        move(Orientation.DOWN);
        move(Orientation.LEFT);
        move(Orientation.RIGHT);
    }

    public static void move(Orientation o){
        switch (o){
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
