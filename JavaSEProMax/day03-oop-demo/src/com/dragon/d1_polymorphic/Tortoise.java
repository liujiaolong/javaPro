package com.dragon.d1_polymorphic;

public class Tortoise extends Animal{
    public String name = "子类乌龟";
    @Override
    void run() {
        System.out.println("乌龟根本跑不了~~~");
    }
}
