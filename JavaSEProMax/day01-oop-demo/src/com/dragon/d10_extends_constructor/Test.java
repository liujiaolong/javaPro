package com.dragon.d10_extends_constructor;

public class Test {
    public static void main(String[] args) {
        //目标：认识继承后子类构造器的特点
        //特点：子类的全部构造器，默认会先访问父类的无参数构造器再执行自己
        Dog d1 = new Dog();
        System.out.println(d1);//父类Animal无参数构造器被执行
                                //子类Dog无参数构造器被执行~~~
                                //com.dragon.d10_extends_constructor.Dog@1b6d3586
        System.out.println("===========");
        Dog d2 = new Dog("金毛");
        System.out.println(d2);//父类Animal无参数构造器被执行
                                //子类Dog有参数构造器被执行
                                //com.dragon.d10_extends_constructor.Dog@4554617c
    }
}
