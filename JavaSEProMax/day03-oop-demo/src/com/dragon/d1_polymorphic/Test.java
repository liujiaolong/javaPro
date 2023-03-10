package com.dragon.d1_polymorphic;

/**
 *  目标：认识多态，理解多态的形式和概念
 */
public class Test {
    public static void main(String[] args) {
        //1、多态的形式：父类类型 对象名称 = new 子类构造器
        Animal a = new Dog();
        a.run(); //编译看左边，运行看右边
        System.out.println(a.name); //对于变量的调用，编译看左边，运行看左边；父类动物

        Animal a2 = new Tortoise();
        a2.run(); //编译看左边，运行看右边
        System.out.println(a2.name);//对于变量的调用，编译看左边，运行看左边；父类动物
    }
}
