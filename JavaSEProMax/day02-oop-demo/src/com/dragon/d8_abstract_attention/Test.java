package com.dragon.d8_abstract_attention;

import com.dragon.d6_abstract.Animal;

public class Test {
    public static void main(String[] args) {
        //目标：理解抽象类的特征和注意事项
        //1、类有的东西，抽象类都有
        //2、抽象类中可以没有抽象方法，但是有抽象方法的必须是抽象类
        //3、一个类继承了抽象类，必须重写抽象类的全部抽象方法，否则这个类必须定义成抽象类
        //4、抽象类不能创建对象，为什么？
            //反证法：假如抽象类可以实例创建对象，a.run(); run()方法连方法体都没有！因此抽象类不能创建对象
            //更刁钻的问题：没有抽象方法，不行的，抽象类不能创建对象（这个观点不能动摇）
        //Animal a = new Animal(); //报错提示：'Animal' 为 abstract；无法实例化
    }
}

//abstract class Animal{
//    //我是抽象类，可以没有抽象方法
//}

//class Animal{
//    //报错，有抽象方法，必须是抽象类
//    public abstract void run();
//}

//class Cat extends Anlmal{
    //注意：必须要全部实现抽象方法，一个都不能缺少
//    @Override
//    public void run() {
//
//    }
//
//    @Override
//    public void eat() {
//
//    }
//}

abstract class Anlmal{
    public abstract void run();
    public abstract void eat();
}