package com.dragon.d2_polymorphic_advantage;

public class Tortoise extends Animal {
    public String name = "子类乌龟";
    @Override
    public void run() {
        System.out.println("乌龟根本跑不了~~~");
    }
}
