package com.dragon.fengzhuang;

public class Student {
    //成员变量 使用private修饰，只能在本类中访问
    private int age;

    //提供getter和setter方法暴露其取值和赋值
    public void setAge(int age){
        if (age >= 0 && age <= 200){
            this.age = age;
        }else{
            System.out.println("您的年龄数据有问题");
        }
    }

    public int getAge(){
        return age;
    }
}
