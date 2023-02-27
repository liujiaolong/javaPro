package com.dragon.d13_interface_jdk8;

import com.dragon.d11_interface_implements.PingPongMan;

public interface SportMan {
    /*
        1、jdk8 开始，默认方法（实例方法）
        -- 必须default修饰，默认用public修饰
        -- 默认方法，接口不能创建对象，这个方法只能过继给实现类，由实现类的对象调用
     */
    default void run(){
        System.out.println("跟的很快~~");
        //go();
    }

    /*
        2、静态方法
        -- 必须static修饰，默认用public修饰
        -- 接口的静态方法，必须接口名自己调用
     */
    public static void inAddr(){
        System.out.println("我们都在学习java新增方法的语法，他是java源码自己会用到的");
    }

    /*
        3、jdk9 开始，开始支持私有方法（实例方法）
        -- 必须private修饰
        -- 必须在接口内部才能被访问
     */
//    private void go(){
//        System.out.println("开始跑~~");
//    }

}

class PingPong implements SportMan{
}

class Test{
    public static void main(String[] args) {
        PingPong p = new PingPong();
        p.run(); //跟的很快~~
        SportMan.inAddr();
    }
}