package com.dragon.d14_interface_attention;

public class Test {
    public static void main(String[] args) {
        //1、接口不能创建对象（接口更加彻底的抽象）
        //2、一个类实现多个接口，多个接口中又同样的静态方法不冲突
        //3、一个类继承了父类，同时又实现了接口，父类中和接口中有同名方法，默认用父类的
        Cat cat = new Cat();
        cat.eat(); //父类动物吃

        //4、一个类实现了多个接口，多个接口中存在同名的默认方法，不冲突，这个类重写该方法即可

        //5、一个接口继承多个接口，是没有问题的，如果多个接口中存在规范冲突则不能继承
    }

}

/********4、一个类实现了多个接口，多个接口中存在同名的默认方法，不冲突，这个类重写该方法即可****/
interface AA{
    default void go(){
        System.out.println("AA");
    }
}
interface BB{
    default void go(){
        System.out.println("BB");
    }
}
class CC implements AA,BB{
    @Override
    public void go() {
        //只能实现自己方法，不会实现AA，BB
    }
}

/********************end*****************/

/*****5、一个接口继承多个接口，是没有问题的，如果多个接口中存在规范冲突则不能继承**/
interface AAA{
    void run();
    //int run(); //有问题
}
interface BBB{
    void run();
}
interface CCC extends AAA,BBB{
    //规范规则冲突则就不知道使用那个了，开发中不会遇到
}

/********end*******/

 /******3、一个类继承了父类，同时又实现了接口，父类中和接口中有同名方法，默认用父类的******/
interface Food{
    default void eat(){
        System.out.println("接口中的吃方法");
    }
}
class Animal{
    public void eat(){
        System.out.println("父类动物吃~~~");
    }
}

//同时继承父类和实现接口(相当于有个亲爸爸，x个干爹)
class Cat extends Animal implements Food{

}
/****************************end*********************************/

/************一个类实现多个接口，多个接口中又同样的静态方法不冲突*******/
interface A{
    static void test(){
        System.out.println("A");
    }
}
interface B{
    static void test(){
        System.out.println("B");
    }
}

/*
    2、一个类实现多个接口，多个接口中又同样的静态方法不冲突
        原因：接口的静态方法不能C调用，只能A调用A的，B调用B的
 */
class C implements A,B{
    public static void main(String[] args) {
        /*****问题2******/
//        A.test();
//        B.test();
//        C.test(); 报错 调不了
    }
}
/***************************end**********/