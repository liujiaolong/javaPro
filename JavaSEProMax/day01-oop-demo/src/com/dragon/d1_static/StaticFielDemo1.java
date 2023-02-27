package com.dragon.d1_static;

public class StaticFielDemo1 {
    public static void main(String[] args) {
        //目标：理解static修饰成员变量的作用和访问特点
        //访问方式：
        //1、类名.静态成员变量
//        System.out.println(User.onlineNumber);
//
//        //可以通过对象来访问，但是官方不推荐
//        User u = new User();
//        u.onlineNumber++;
//        System.out.println(u.onlineNumber);
        User s = new User();
        s.getThis(); //this 代表对象地址
    }
}
