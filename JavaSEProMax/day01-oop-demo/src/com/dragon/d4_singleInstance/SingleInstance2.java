package com.dragon.d4_singleInstance;

/**
 * 使用懒汉单例实现单例类
 */
public class SingleInstance2 {
    /**
     * 2、定义一个静态成员变量，负责存储一个对象
     *     因为静态变量只加载一次，在内存中只有一份
     *     注意：最好私有化，这样可以避免给别人挖坑
     */
//    public static SingleInstance2 instance; //默认：null，不能new，否则就是饿汉单例
    private static SingleInstance2 instance; //默认：null，不能new，否则就是饿汉单例
    /**
     * 3、提供一个方法，对外返回单例对象
     */
    public static SingleInstance2 getInstance(){
        if (instance == null){
            //第一次来拿对象，此时需要创建对象
            //System.out.println("create instance...");
            instance = new SingleInstance2();
        }
        return instance;
    }

    /**
     * 1、必须把构造器私有化
     */
    private SingleInstance2(){}
}
