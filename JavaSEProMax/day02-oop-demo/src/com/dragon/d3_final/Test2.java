package com.dragon.d3_final;

public class Test2 {
    /**
     * 修饰静态成员变量(public static final 修饰也称为常量)
     */
    public static final String schoolName = "黑马";

    /**
     * 3、修饰实例成员变量（几乎不用）
     */
    private final String name = "猪八戒";

    public static void main(String[] args) {
        //目标： //3、final修饰变量，总规则，变量有且仅能被赋值一次。（理解语法）
        //变量有几种：
        //      1、局部变量
        //      2、成员变量
        //          ---实例成员变量
        //          ----静态成员变量
        /***********局部变量**********/
        final double rate = 3.14;
        //rate = 3.3; //报错，第二次赋值报错
        buy(0.8);

        //schoolName = "avsdf"; //第二次赋值

        //注意：final修饰引用类型的变量，其地址值不能改变，但是指向的对象内容可以改变
        final Teacher t = new Teacher("学习，授课，吹吹水~~~");
        //t = null;//第二次赋值
        System.out.println(t.getHobby());//学习，授课，吹吹水~~~
        t.setHobby("运动");
        System.out.println(t.getHobby()); //运动

    }

    public static void buy(final double z){
        //z = 0.1; //第二次赋值
    }

}

class Teacher{
    private String hobby;

    public Teacher(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}