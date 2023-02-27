package com.dragon.d6_innerclass;

/**
 * 外部类
 */

public class Outer {
    public static int num = 111;
    private String hobby;
    /*
        成员内部类：不能加static修饰，属于外部类对象的
     */
    public class Inner {
        private  String name;
        private int age;
        //public static int a; //jdk16开始支持静态成员

        public void show(){
            System.out.println("名称：" + name);
            System.out.println("数量：" + num);
            System.out.println("爱好：" + hobby);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
