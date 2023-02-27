package com.dragon.thisdemo;

public class Car {
    String name;
    double price;
    //无参数构造
    public Car(){
        System.out.println("无参数构造器中的this：" + this);
    }
    public Car(String name , double price){
        //就近为内部name赋值，为了解决该问题，就加上this
        //name = name; 错误
        //price = price; 错误
        //----------this
        this.name = name;
        this.price = price;
    }

    public void goWith(String name){
        //就近为内部name赋值，为了解决该问题，就加上this
        //System.out.println(name + "正在和" + name + "比赛*****"); //错误
        System.out.println(this.name + "正在和" + name + "比赛*****");
    }
    public void run(){
        System.out.println("方法中的this:" + this);
    }
}
