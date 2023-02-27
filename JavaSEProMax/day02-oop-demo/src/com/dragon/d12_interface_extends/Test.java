package com.dragon.d12_interface_extends;

public class Test {
    public static void main(String[] args) {
        //目标：理解接口多继承的作用
        BasketBallMan b = new BasketBallMan();
        b.run();
        b.competition();
        b.rule();
        b.eat();
        b.sleep();
    }
}
