package com.dragon.d7_abstract_test;

public class Test {
    public static void main(String[] args) {
        //目标：学习一下抽象类的基本使用：做父类，被继承，重写抽象方法
        GoldCard g = new GoldCard();
        g.setMoney(10000);
        g.setUserName("小明");
        g.pay(300);

        System.out.println("剩余：" + g.getMoney());
    }
}
