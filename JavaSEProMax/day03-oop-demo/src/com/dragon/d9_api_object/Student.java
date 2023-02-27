package com.dragon.d9_api_object;

import java.util.Objects;

public class Student { //extends Object{
    private String name;
    private char sex;
    private int age;

    public Student() {
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
        重写父类equals，自己定制相等规则
        两个对象的内容一样，就认为是相等的
        比较者：s1
        被比较者：s2
        //自定义比较
     */
//    public boolean equals(Object o){
//        // 1、判断o是不是学生类型
//        if (o instanceof Student){
//            //强制转换成Student类型
//            Student s2 = (Student) o;
//            //2、判断2个对象的内容是否一样
//            if (this.name.equals(s2.name) && this.age == s2.age && this.sex == s2.sex){
//                return true;
//            }
//            return false;
//        }
//        //学生只能和学生比较，否则结果一定是false
//        return false;
//
//    }
 /*
        重写父类equals，自己定制相等规则
        两个对象的内容一样，就认为是相等的
        比较者：s1 ==> this
        被比较者：s2 ==> o
     */

    @Override //官方自动生成比较
    public boolean equals(Object o) {
        //1、判断是否是同一个对象比较，如果是返回true
        if (this == o) return true;
        //2、如果o是null返回false，如果o不是学生类型..Student != ..Pig，返回false
        if (o == null || getClass() != o.getClass()) return false;
        //3、说明o一定是学生类型，而且不为null
        Student student = (Student) o;
        return sex == student.sex && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }


}
