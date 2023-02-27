package com.dragon.d1_date;

import java.util.Date;

/*
    目标：学会使用Date类处理时间，获取时间的信息
 */
public class DateDemo1 {
    public static void main(String[] args) {
        //1、创建一个Date类的对象，代表系统此刻日期对象
        Date d = new Date();
        System.out.println(d);//Tue Nov 29 22:16:51 CST 2022

        //2、获取时间毫秒值
        long time = d.getTime();
        System.out.println(time);

        System.out.println("--------------------------");
        //1、得到当前时间毫秒值
        long time1 = System.currentTimeMillis(); //当前时间
        time1 += (60 * 60 + 121) * 1000;
        //方案1：
        //Date d2 = new Date(time1); //把时间毫秒值转换成对应日期对象
        //System.out.println(d2);
        //方案2：
        Date d3 = new Date();
        d3.setTime(time1);
        System.out.println(d3);
    }
}
