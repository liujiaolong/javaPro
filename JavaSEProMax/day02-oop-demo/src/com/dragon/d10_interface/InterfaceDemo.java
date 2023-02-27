package com.dragon.d10_interface;

/*
    声明了一个接口，体现一种规范，规范一定是公开的
 */
public interface InterfaceDemo {
    //目标：接口中的成分特点，JDK8之前接口中只能有抽象方法和常量
    //1、常量
    //注意：由于接口体现规范思想，规范默认都是公开的，所以代码层面，public static final可以省略不写
    //public static final String SCHOOL_NAME = "黑马程序员";
    String SCHOOL_NAME = "黑马程序员"; //不是不同成员变量

    //2、抽象方法
    //注意：由于接口体现规范思想，规范默认都是公开的，所以代码层面，public abstract可以省略不写
    //public abstract void run();
    void run();
    //public abstract void eat();
    void eat();
}
