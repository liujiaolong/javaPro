package com.dragon.d6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        String rs = "来黑马程序学习Java,电话020-43422424，或者联系邮箱" +
             "itcast@itcast.cn,电话18762832633，020323232" +
             "邮箱bozai@itcast.cn，400-100-3233 ， 4001003232";
        //需求：从上面内容爬取出 电话号码和邮箱
        //定义爬取规则 字符串形式
        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})" +
                "|(1[3-9]\\d{9})" +
                "|(0\\d{2,6}-?\\d{5,20})" +
                "|(400-?\\d{3,9}-?\\d{3,9})";
        //需要把这个爬取规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        //得到一个内容匹配器对象
        Matcher matcher = pattern.matcher(rs);

        //开始找内容
        while (matcher.find()){
            System.out.println(matcher.group());//020-43422424
                                                //itcast@itcast.cn
                                                //18762832633
                                                //020323232
                                                //bozai@itcast.cn
                                                //400-100-3233
                                                //4001003232
        }
    }
}
