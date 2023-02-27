package com.dragon.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        // 开始 和 结束时间
        String startTime = "2021-11-11 00:00:00";
        String endTime = "2021-11-11 00:10:00";

        //小贾 小皮
        String xiaoJia = "2021-11-11 00:03:47";
        String xiaoPi = "2021-11-11 00:10:11";

        //解析他们的时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = simpleDateFormat.parse(startTime);
        Date d2 = simpleDateFormat.parse(endTime);
        Date d3 = simpleDateFormat.parse(xiaoJia);
        Date d4 = simpleDateFormat.parse(xiaoPi);

        if (d3.after(d1) && d3.before(d2)){ //类似if(d3 > d1 && d3 < d2)
            System.out.println("小贾秒杀成功，可以发货~~~");
        }else{
            System.out.println("小贾秒杀失败~~~");
        }

        if (d4.after(d1) && d4.before(d2)){
            System.out.println("小皮秒杀成功，可以发货~~~");
        }else{
            System.out.println("小皮秒杀失败~~~");
        }
    }
}
