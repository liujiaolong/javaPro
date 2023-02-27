package com.dragon.thisdemo;

public class Test {
    public static void main(String[] args) {

        Car c2 = new Car("奔驰" , 39.9);
        System.out.println(c2.name);
        System.out.println(c2.price);

        c2.goWith("宝马"); //奔驰正在和宝马比赛*****
    }
}
