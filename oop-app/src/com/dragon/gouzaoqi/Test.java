package com.dragon.gouzaoqi;

public class Test {
    public static void main(String[] args) {
        //通过调用构造器得到对象
        Car c = new Car(); //==无参数构造器被调用了==
        System.out.println(c.name); //null
        System.out.println(c.price); //0.0

        //有参数构造器
        Car c2 = new Car("奔驰" , 39.8);//==有参数构造器被调用了==
        System.out.println(c2.name);
        System.out.println(c2.price);
    }
}
