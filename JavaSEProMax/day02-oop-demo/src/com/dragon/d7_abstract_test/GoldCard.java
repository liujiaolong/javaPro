package com.dragon.d7_abstract_test;

public class GoldCard extends Card{

    @Override
    public void pay(double money) {
        System.out.println("您当前消费：" + money);
        System.out.println("您卡片当前余额是：" + getMoney());

        //进行优惠价计算
        double rs = money * 0.8;
        System.out.println(getUserName() + "：您实际支付：" + rs);

        //更新账户余额
        setMoney(getMoney() - rs);
    }
}
