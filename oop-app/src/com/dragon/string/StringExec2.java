package com.dragon.string;

import java.util.Scanner;

public class StringExec2 {
    public static void main(String[] args) {
        //键盘录入一个手机号
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入您的手机号码：");
        String tel = sc.next();

        //屏蔽中间数字
        String before = tel.substring(0,3); //0 1 2
        String after = tel.substring(7); //从索引7开始截取到手机号码末尾
        String s = before + "****" + after;
        System.out.println(s);
    }
}
