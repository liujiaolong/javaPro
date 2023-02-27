package com.dragon.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //目标：学会使用键盘录入技术
        //得到一个键盘扫描对象
        Scanner sc = new Scanner(System.in);

        //调用sc对象的功能等待接收用户输入的数据
        // 这个代码会等待用户输入数据，直到用户输入完数据并按了回车键会把数据拿到
        System.out.println("请您输入您的年龄：");
        int age = sc.nextInt();
        System.out.println("您的年龄是：" + age);

        System.out.println("请您输入您的名称：");
        String name = sc.next();
        System.out.println("欢迎： " + name);
    }
}
