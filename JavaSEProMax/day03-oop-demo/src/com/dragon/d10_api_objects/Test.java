package com.dragon.d10_api_objects;

import java.util.Objects;

/*
    目标：掌握Objects类中常用方法：equals
 */
public class Test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "itheima";
        //System.out.println(s1.equals(s2)); //留下隐患，可能出现空指针异常
        System.out.println(Objects.equals(s1, s2));//false 更安全，结果也更准确

        System.out.println(Objects.isNull(s1));//true
        System.out.println(Objects.isNull(s2));//false
    }
}
