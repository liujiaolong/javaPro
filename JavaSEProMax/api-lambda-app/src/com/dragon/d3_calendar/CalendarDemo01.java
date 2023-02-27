package com.dragon.d3_calendar;

import java.util.Calendar;

public class CalendarDemo01 {
    public static void main(String[] args) {
        // 拿到系统此刻日历对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);//java.util.GregorianCalendar[time=1669736547320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=10,WEEK_OF_YEAR=49,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=333,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=42,SECOND=27,MILLISECOND=320,ZONE_OFFSET=28800000,DST_OFFSET=0]

        //获取日历的信息:public int get(int field):获取日历中某个字段信息
       int year = calendar.get(Calendar.YEAR);
       System.out.println(year);
        int mm = calendar.get(Calendar.MONTH) + 1; //默认从0开始
        System.out.println(mm);
        int days = calendar.get(Calendar.DAY_OF_YEAR); //一年中第多少天
        System.out.println(days);
        //public void set(int field , int value):修改日历的某个字段信息
        //calendar.set(Calendar.HOUR , 12); //一般不修改日期
        //System.out.println(calendar);

        //public void add(int field , int amount):为某个字段增添加/减少指定的值
        //请问64天后是什么时间
//        calendar.add(Calendar.DAY_OF_YEAR , 64);

        //public final Date getTime():拿到此刻日期对象
        System.out.println(calendar.getTime());

        //public long getTimeInMillis():拿到此刻时间毫秒值
        long time = calendar.getTimeInMillis();
        System.out.println(time);
    }
}
