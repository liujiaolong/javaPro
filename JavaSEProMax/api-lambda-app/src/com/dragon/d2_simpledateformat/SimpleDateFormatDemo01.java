package com.dragon.d2_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    目标：SimpleDateFormat 简单日期格式化类的使用
    格式化时间
    解析时间
 */
public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {
        //日期对象
        Date d = new Date();
        System.out.println(d);

        //格式化这个日期对象(指定最终格式化的形式                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          )
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        //System.out.println(sdf);
        //开始格式化日期对象成为喜欢的字符串形式
        String rs = sdf.format(d);
        System.out.println(rs);

        System.out.println("-------------------------");
        //格式化时间毫秒值
        //需求：请问121秒后的时间是多少
        long time = System.currentTimeMillis() + 121*1000;
        String res = sdf.format(time);
        System.out.println(res);
    }
}
