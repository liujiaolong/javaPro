package com.dragon.d1_static;

public class Test3 {
    /**
     * 静态成员
     */
    public static int onlineNumber = 10;
    public static void  test2(){
        System.out.println("==test2==");
    }

    /**
     *  实例成员
     */
    private String name;
    public void run(){
        System.out.println(name + "跑得快~~~");
    }


    //1、静态方法只能访问静态的成员，不可以直接访问实例成员
    public static void  test(){
        System.out.println(Test3.onlineNumber); //可以访问
        System.out.println(onlineNumber); //可以访问
        test2(); //可以访问
        Test3.test2();//可以访问

        //System.out.println(name);//不能直接访问实例成员变量
        // run();//不能直接访问实例成员方法

        //创建对象可以进行访问
        Test3 t = new Test3();
        System.out.println(t.name); //可以访问
    }

    //2、实例方法可以访问静态的成员，也可以访问实例成员
    public void go(){
        //静态成员是共享的
        System.out.println(Test3.onlineNumber); //可以访问
        System.out.println(onlineNumber); //可以访问
        test2(); //可以访问
        System.out.println(name); //可以访问，name是当前对象的
        System.out.println(this); //可以访问
        run();//可以访问，run也是实例成员
    }

    //3、静态方法中不可以出现this关键字
    public static void test3(){
        //System.out.println(this); //报错，不可访问，this只能代表当前对象！！！
    }


    public static void main(String[] args) {
        /**
         * 目标： 理解static 访问相关的语法；面试笔试题，或者以后理解程序很重要的知识（拓展）
         */
    }


}
