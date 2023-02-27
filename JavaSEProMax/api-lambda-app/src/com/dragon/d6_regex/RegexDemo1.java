package com.dragon.d6_regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        //需求：校验qq号码，必须是全部数字6-20位
        System.out.println(checkQQ("2514562a"));
        System.out.println(checkQQ("2514562"));
        System.out.println(checkQQ("1235"));
        System.out.println(checkQQ(null));

        System.out.println("--------------------");

        //正则表达式初体验
        System.out.println(checkQQ2("2514562a"));
        System.out.println(checkQQ2("2514562"));
        System.out.println(checkQQ2("1235"));
        System.out.println(checkQQ(null));
    }

    public static boolean checkQQ2(String qq){
        //  \d代表的是数字
        return qq != null && qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ(String qq){
        //判断qq号码的长度是否满足
        if (qq == null || qq.length() < 6 || qq.length() > 20){
            return false;
        }
        //判断qq中是否全部是数字，不是返回false
        for (int i = 0; i < qq.length(); i++) {
            //获取每位字符
            char ch = qq.charAt(i);
            //判断这个字符是否是数字，如果不是则返回false
            if (ch < '0' || ch > '9'){
                return false;
            }
        }
        return true;
    }
}
