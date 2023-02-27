package com.dragon.d11_extends_constructor;

public class Teacher extends People{
    public Teacher(String name , int age){
        //调用父类的有参数构造器，初始化继承自父类的数据
        super(name , age); //父类有参数构造器
        //super(); //父类无参数构造器
    }
}
