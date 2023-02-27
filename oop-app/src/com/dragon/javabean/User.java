package com.dragon.javabean;

public class User {
    //1、成员变量建议使用private私有化
    private String name;
    private double height;
    private double salary;

    //3、要求提供无参数构造器(JavaBean中自带无参构造器)，
    // 有参数构造器是可选，如果提供了，那么必须提供一个无参数构造器
    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    //无参数构造器
    public User() {
    }

    //2、必须为成员变量提供成套的setter 和 getter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
