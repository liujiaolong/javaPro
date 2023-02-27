package com.dragon.string;

import java.util.Random;

public class StringExec {
    public static void main(String[] args) {
        //定义可能出现的字符信息
        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //循环5次，每次生成一个随机的索引，提取对应的字符连接起来即可
        String code = "";
        Random r = new Random();
        for(int i = 0; i < 5; i++){
            //随机一个索引
            int index = r.nextInt(datas.length());
            char c = datas.charAt(index);
            code += c;
        }
        //输出验证码
        System.out.println(code);
    }

}
