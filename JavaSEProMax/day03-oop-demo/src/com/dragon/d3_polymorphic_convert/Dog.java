package com.dragon.d3_polymorphic_convert;

public class Dog extends Animal {
    @Override
    public void run(){
        System.out.println("狗跑的贼溜~~~~");
    }
    /*
      独有功能
     */
    public void lookDoor(){
        System.out.println("狗在看");
    }
}
