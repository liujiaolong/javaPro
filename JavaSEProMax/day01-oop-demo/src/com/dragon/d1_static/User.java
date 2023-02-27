package com.dragon.d1_static;

public class User {
    /*
    * 在线人数
    * 注意：static 修饰的成员变量：静态成员变量，
    *       只在内存中只有一份，因为对外访问，一般
    *       使用public来修饰
    * */
    public static int onlineNumber = 161;

    private String name;
    private int age;

    public void getThis(){
        System.out.println(this);
    }
}
