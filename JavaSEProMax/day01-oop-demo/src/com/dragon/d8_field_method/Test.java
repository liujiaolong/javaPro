package com.dragon.d8_field_method;

public class Test {
    public static void main(String[] args) {
        //目标：理解继承后成员的访问特点：就近原则
        Dog d = new Dog();
        d.run(); //子类
        d.lookDoor();//子类
        d.showName();
    }
}

class Animal{
    public String name = "动物名";
    public void run(){
        System.out.println("动物可以跑~~~");
    }
}

class Dog extends Animal{
    public String name = "狗名称";

    public void lookDoor(){
        System.out.println("狗可以看门");
    }

    public void showName(){
        String name = "局部名";
        System.out.println(this.name); //当前子类对象name
        System.out.println(super.name); //父类name

        run(); //子类的run方法
        super.run(); //父类的run方法
    }

    public void run(){
        System.out.println("狗跑的贼快~~~");
    }
}
