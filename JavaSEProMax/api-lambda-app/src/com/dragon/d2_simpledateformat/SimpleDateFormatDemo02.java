package com.dragon.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo02 {
    public static void main(String[] args) throws ParseException {
        //目标：学会使用SimpleDateFormat解析字符串时间成为时间对象
        //案例：请计算出2121年08月06日11点11分11秒，往后走2天14小时49分06秒后的时间是多少？
        String dateStr = "2121年08月06日 11:11:11";
        //把字符串时间解析成日期对象（重点）
        //形式必须与被解析时间的形式完全一样，否则解析报错
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = sdf.parse(dateStr);
        //往后走2天14小时49分06秒
        long time = d.getTime() + (2L * 24 * 60 * 60 + 14 * 60 * 60 + 49 *60 + 6) * 1000;

        //格式化这个时间毫秒值就是结果
        System.out.println(sdf.format(time));
    }
}
