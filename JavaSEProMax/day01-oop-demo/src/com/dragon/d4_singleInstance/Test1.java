package com.dragon.d4_singleInstance;

public class Test1 {
    public static void main(String[] args) {
        //理解饿汉单例的设计步骤
        SingleInstance s1 = SingleInstance.instance;
        SingleInstance s2 = SingleInstance.instance;
        //如何看是否是单例，那就看这两个对象获取到的地址是否相等
        System.out.println(s1 == s2); //true
    }
}
