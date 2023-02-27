package com.dragon.d11_genericity_limit;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        //go(dogs); //使用?代表一切类型，狗也能和汽车进行比赛了，此处有问题
    }

    /**
     * 所有车进行比赛
     * */

    public static void go(ArrayList<? extends Car> cars){

    }
}

class Dog{

}

class BENZ extends Car{

}

class BMW extends Car{

}

//父类
class Car{

}