package com.dragon.javabean;

public class Test {
    public static void main(String[] args) {
        double a ;
        //通过无参数构造器创建对象封装一个用户信息
        User u1 = new User();
        u1.setName("黑马吴彦祖");
        u1.setHeight(180.5);
        u1.setSalary(1000);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());

        System.out.println("------------------");

        //有参数构造器创建对象封装一个用户信息
        User u2 = new User("黑马武大郎" , 156 , 3000);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());
    }
}
