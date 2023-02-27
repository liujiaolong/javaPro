package com.dragon.d4_jdk8_time;

import java.time.*;

public class timeDemo {
    public static void main(String[] args) {
        System.out.println("****************LocalDate*******************");
        /****************LocalDate*******************/
        //获取本地日期对象
        LocalDate newDate = LocalDate.now();
        System.out.println("今天的日期：" + newDate);//今天的日期：2022-11-30

        int year = newDate.getYear();
        System.out.println("year：" + year); //2022

        int month = newDate.getMonthValue();
        System.out.println("month：" + month); //11

        int day = newDate.getDayOfMonth();
        System.out.println("day：" + day); //30

        //当年的第几天
        int dayOfYear = newDate.getDayOfYear();
        System.out.println("dayOfYear：" + dayOfYear); //334

        //星期几
        System.out.println(newDate.getDayOfWeek());//WEDNESDAY---英文
        System.out.println(newDate.getDayOfWeek().getValue());//3---周几

        //几月份
        System.out.println(newDate.getMonth()); //NOVEMBER---英文
        System.out.println(newDate.getMonth().getValue()); //11

        //指定日期
        LocalDate bt = LocalDate.of(1991,11,11);
        System.out.println(bt);//1991-11-11
        System.out.println(LocalDate.of(1991, Month.NOVEMBER , 11));//1991-11-11

        System.out.println("****************LocalTime*******************");

        /****************LocalTime*******************/
        //获取本地时间对象
        LocalTime nowTime = LocalTime.now();
        System.out.println("今天的时间：" + nowTime);  //今天的时间

        int hour = nowTime.getHour();//时
        System.out.println("hour：" + hour);

        int minute = nowTime.getMinute();//分
        System.out.println("minute：" + minute);

        int second = nowTime.getSecond();//秒
        System.out.println("second：" + second);

        int nano = nowTime.getNano();//纳秒
        System.out.println("nano：" + nano);

        //指定时间
        System.out.println(LocalTime.of(8,20));
        System.out.println(LocalTime.of(8,20 , 30));
        System.out.println(LocalTime.of(8,20 , 30 , 150));
        System.out.println(LocalTime.of(8,20 , 30 , 150));

        System.out.println(LocalDateTime.of(1991,11,11,8,20));
        System.out.println(LocalDateTime.of(1991,Month.NOVEMBER,11,8,20));

        System.out.println("****************LocalDateTime*******************");

        /****************LocalDateTime*******************/
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("今天是：" + nowDateTime);
        System.out.println(nowDateTime.getYear());//年
        System.out.println(nowDateTime.getMonthValue());//月
        System.out.println(nowDateTime.getDayOfMonth());//日
        System.out.println(nowDateTime.getHour());//时
        System.out.println(nowDateTime.getMinute());//分
        System.out.println(nowDateTime.getSecond());//秒
        System.out.println(nowDateTime.getNano());//纳秒

        //日：当年的第几天
        System.out.println("dayOfYear：" + nowDateTime.getDayOfYear());

        //星期
        System.out.println(nowDateTime.getDayOfWeek());
        System.out.println(nowDateTime.getDayOfWeek().getValue());

        //月份
        System.out.println(nowDateTime.getMonth());
        System.out.println(nowDateTime.getMonth().getValue());

        //对象转换，因为LocalDateTime包含LocalDate和LocalTime
        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);//2022-11-30

        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());

        System.out.println("****************Update Time*******************");
        //修改日期时间
        //LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);//当前时间
        System.out.println(nowTime.minusHours(1));//一小时前
        System.out.println(nowTime.minusMinutes(1));//一分钟前
        System.out.println(nowTime.minusSeconds(1));//一秒前
        System.out.println(nowTime.minusNanos(1));//一纳秒前

        System.out.println("----------------");

        System.out.println(nowTime.plusHours(1));//一小时后
        System.out.println(nowTime.plusMinutes(1));//一分钟后
        System.out.println(nowTime.plusSeconds(1));//一秒后
        System.out.println(nowTime.plusNanos(1));//一纳秒后
        System.out.println("----------");
        //不可变对象，每次修改产生新对象
        System.out.println(nowTime);

        System.out.println("----------");
        LocalDate myDate = LocalDate.of(2018,9,5);
        LocalDate nowDate = LocalDate.now();

        System.out.println("今天是2018-09-06吗？" + nowDate.equals(myDate));
        System.out.println(myDate + "是否在" + nowDate + "之前？" + myDate.isBefore(nowDate));
        System.out.println(myDate + "是否在" + nowDate + "之后？" + myDate.isAfter(nowDate));

        System.out.println("----------------");
        //判断今天是否是你的生日
        LocalDate birDate = LocalDate.of(1996,11,30);//设置日期
        LocalDate nowDate1 = LocalDate.now();//当前日期
        MonthDay birMd = MonthDay.of(birDate.getMonthValue() , birDate.getDayOfMonth());
        //等同于 MonthDay birMd = MonthDay.from(birDate);
        System.out.println(birMd);//--03-14
        MonthDay nowMd = MonthDay.from(nowDate1);//--11-30
        System.out.println(nowMd);//--11-30
        System.out.println("今天是你的生日吗？" + birMd.equals(nowMd));//今天是你的生日吗？true
    }
}
