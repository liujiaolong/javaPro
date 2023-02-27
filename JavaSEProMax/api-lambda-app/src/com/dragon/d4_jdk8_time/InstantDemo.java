package com.dragon.d4_jdk8_time;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class InstantDemo {
    public static void main(String[] args) {
        //得到一个Instant时间戳对象
        Instant instant = Instant.now();
        System.out.println(instant);//2022-11-30T14:12:56.750Z

        //得到系统此刻的时间戳
        Instant instant1 = Instant.now();
        System.out.println(instant1.atZone(ZoneId.systemDefault()));//2022-11-30T22:12:56.793+08:00[Asia/Shanghai]

        //如何去返回Date对象
        Date date = Date.from(instant);
        System.out.println(date);//Wed Nov 30 22:12:56 CST 2022

        Instant i2 = date.toInstant();
        System.out.println(i2);//2022-11-30T14:12:56.750Z
    }
}
