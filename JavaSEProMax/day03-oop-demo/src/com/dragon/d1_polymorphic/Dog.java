package com.dragon.d1_polymorphic;

public class Dog extends Animal {
    public String name = "子类狗";
    @Override
    void run() {
        System.out.println("狗跑的很快~~");
    }
}
