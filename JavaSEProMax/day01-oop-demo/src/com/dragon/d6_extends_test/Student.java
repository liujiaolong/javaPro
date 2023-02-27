package com.dragon.d6_extends_test;

/**
 * 学生类、子类
 */
public class Student extends People{
    /**
     * 独有行为，填写反馈信息
     */

    public void writeInfo(){
        //getName(); 是父类方法
        System.out.println(getName() + "写下了：学习方法，好哈皮~");
    }
}
