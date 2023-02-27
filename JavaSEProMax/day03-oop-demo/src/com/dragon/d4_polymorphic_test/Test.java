package com.dragon.d4_polymorphic_test;

/**
    目标：USB设备模拟
    1、定义USB接口：接入、拔出
    2、定义2个USB实现类：鼠标、键盘
    3、创建一个电脑对象，创建USB设备对象，安装启动
 */
public class Test {
    public static void main(String[] args) {
        //1、创建电脑对象
        Computer computer = new Computer("外星人");
        computer.start();
        //2、创建鼠标对象、键盘对象
        USB keyBoard = new KeyBoard("双飞燕");
        computer.installUSB(keyBoard);

        System.out.println("--------------------");
        USB mouse = new Mouse("罗技");
        computer.installUSB(mouse);
    }
}
