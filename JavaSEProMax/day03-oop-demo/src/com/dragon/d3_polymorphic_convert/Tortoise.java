package com.dragon.d3_polymorphic_convert;
public class Tortoise extends Animal {
    @Override
    public void run() {
        System.out.println("乌龟根本跑不了~~~");
    }

    /*
      独有功能
     */
    public void layEggs(){
        System.out.println("乌龟在下蛋~~~");
    }
}

