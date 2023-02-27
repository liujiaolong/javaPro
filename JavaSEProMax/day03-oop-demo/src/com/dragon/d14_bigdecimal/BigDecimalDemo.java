package com.dragon.d14_bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        //浮点型运算的时候直接 + - * / 可能会出现数据失真(精度问题)
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 / 100);

        System.out.println("------------------");
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);

        System.out.println("------------------------");
        //包装浮点型数据成为大数据对象 BigDecimal
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        //BigDecimal c1 = a1.add(b1); //加法
        //BigDecimal c1 = a1.subtract(b1); //减法
        //BigDecimal c1 = a1.multiply(b1); //乘法
        BigDecimal c1 = a1.divide(b1); //除法
        System.out.println(c1);

        //System.out.println(c1.getClass());//class java.math.BigDecimal 类型

        //一般在开发中，返回的肯定不是BigDecimal类型，因此需要转换
        //目的：double，手段是BigDecimal
        double rs = c1.doubleValue();
        System.out.println(rs);

        //注意事项：BigDecimal是一定要精度运算的，否则会报错异常
        BigDecimal a11 = BigDecimal.valueOf(10.0);
        BigDecimal a12 = BigDecimal.valueOf(3.0);
        /**
         * 参数一：除数
         * 参数二：保留小数位
         * 参数三：舍入模式，类似四舍五入等模式
         */
        BigDecimal a13 = a11.divide(a12 , 2 , BigDecimal.ROUND_UP); //3.3333333333
        System.out.println(a13); //3.34

        System.out.println("---------------------------");

    }
}
