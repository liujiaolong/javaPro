package com.dragon.d2_polymorphic_advantage;

public class Test {
    public static void main(String[] args) {
        Animal a = new Tortoise();
        go(a);

        Animal a2 = new Dog();
        go(a2);
        //a2.lookDoor();//多态下不能访问子类独有功能
    }

    /*
        要求所有的动物都可以进来比赛
     */
    public static void go(Animal a){
        System.out.println("开始....");
        a.run();
        System.out.println("结束....");
    }
}
