package com.dragon.guwuche;

import java.util.Scanner;

public class ShopCar {
    public static void main(String[] args) {
        //1、定义商品类，用于后期创建商品对象
        //2、定义购物车对象：使用一个数组对象表示 Goods[] 代表商品类型的数组
        Goods[] shopCar = new Goods[100]; //商品类型的数组，长度是100，最多可以装100个商品对象 [null,null,null,...]
        //3、搭建操作架构
        while (true) {
            System.out.println("请您选择如下命令进行操作");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询商品到购物车：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算购买商品的金额：pay");
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入命令：");
            String command = sc.next();
            switch (command){
                case "add":
                    //添加商品到购物车
                    addGoods(shopCar , sc);
                    break;
                case "query":
                    //查询购物车商品展示
                   queryGoods(shopCar);
                    break;
                case "update":
                    //修改商品购买数量
                    updateGoods(shopCar , sc);
                    break;
                case "pay":
                    //结算金额
                    pay(shopCar);
                    break;
                default:
                    System.out.println("没有该功能！");
            }
        }
    }
    public static void pay(Goods[] shopCar) {
        double money = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null){
                money += (g.price * g.buyNumber);
            }
        }
        System.out.println("订单总金额：" + money);
    }
    public static void updateGoods(Goods[] shopCar , Scanner sc) {
        while (true) {
            System.out.println("请您输入要修改的商品id:");
            int id = sc.nextInt();
            Goods g = getGoodsById(shopCar , id);
            if (g == null) {
                //没有该商品
                System.out.println("对不起，没有购买商品！");
            }else{
                //说明存在该商品对象，可以修改它了
                System.out.println("请您输入：" + g.name + "商品最新购买数量");
                int buyNumber = sc.nextInt();
                g.buyNumber = buyNumber;
                System.out.println("修改完成");
                queryGoods(shopCar);
                break;
            }
        }
    }
    public static Goods getGoodsById(Goods[] shopCar , int id){
        //shopCar = [null,null,null,....]
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null &&  g.id == id){
                return g;
            }
        }
        return null; //代表找完100个商品都没有找到id一样的商品
    }
    //查询购物车的商品对象，并展示出来
    public static void queryGoods(Goods[] shopCar) {
        System.out.println("============查询购物车信息如下===============");
        System.out.println("编号\t\t名称\t\t\t价格\t\t\t购买数量");
        for (int i = 0; i < shopCar.length; i++) {
            //shopCar = [g1,g2,g3,.......]
            Goods g = shopCar[i];
            if (g != null){
                System.out.println(g.id + "\t\t" + g.name + "\t\t\t" + g.price + "\t\t\t" + g.buyNumber);
            }
        }
    }

    //商品添加
    public static void addGoods(Goods[] shopCar , Scanner sc) {
        //1 、录入用户输入的购买商品信息
        System.out.println("请您输入购买商品的编号（不重复）：");
        int id = sc.nextInt();
        System.out.println("请您输入购买商品的名称：");
        String name = sc.next();
        System.out.println("请您输入购买商品数量：");
        int buyNumber = sc.nextInt();
        System.out.println("请您输入购买商品价格：");
        double price = sc.nextDouble();

        //2 、 把这个购买商品的信息封装成一个商品对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.buyNumber = buyNumber;
        g.price = price;

        //3 、 把这个商品对象添加到购物车数组中去
        // shopCar = [null,null,null,....]
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null){
                //说明此位置没有元素存入，把我们新买商品添加到此处即可
                shopCar[i] = g; //存的商品对象地址
                break; //结束，不需要继续找位置了
            }
        }
        System.out.println("您的商品：" + g.name + "添加到购物车完成");
    }
}
