package com.dragon.d3_polymorphic_convert;

/**
 * 目标：学习多态形式下的类中转换机制
 */
public class Test {
    public static void main(String[] args) {
        // 自动类型转换
        Animal a = new Dog();
        a.run();
        // 强制类型转换
        Animal a2 = new Tortoise();
        a2.run();
        /***父类转子类***/
        //Tortoise t = (Tortoise) a2; //从父类类型到子类类型：必须强制类型转换
        //t.layEggs();

        /****注意*****/
        //Dog d = (Dog)a2; //报错 强制类型转换，
                        // 编译阶段不报错的（注意：有继承或者实现关系编译阶段可以强制，没
                        // 有毛病），运行时可能出错的

        /****关键字instanceof****/
//        if (a2 instanceof Tortoise){
//            Tortoise t = (Tortoise) a2;//从父类类型到子类类型：必须强制类型转换
//            t.layEggs();
//        }else if (a2 instanceof Dog){
//            Dog d = new Dog();
//            d.lookDoor();
//        }
        System.out.println();
        go(new Dog());
        go(new Tortoise());
    }

    public static void go(Animal a){
        a.run();
        if (a instanceof Tortoise){
            Tortoise t = (Tortoise) a;//从父类类型到子类类型：必须强制类型转换
            t.layEggs();
        }else if (a instanceof Dog){
            Dog d = (Dog) a;
//            Dog d = new Dog();
            d.lookDoor();
        }
    }
}
