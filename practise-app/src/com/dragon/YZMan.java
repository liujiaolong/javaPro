package com.dragon;

import java.util.Random;

//验证码
public class YZMan {
    public static void main(String[] args) {
        String code = createCode(5);
        System.out.println("验证码为：" + code);
    }

    //随机验证码方法
    public static String createCode(int n){
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            //生成一个随机字符：英文大写0 小写1 数字2
            int type = r.nextInt(3);// 0 1 2
            switch (type){
                case 0:
                    //大写字符(A -> 65  ---- Z 65+25) (0 - 25) + 65
                    char ch = (char) (r.nextInt(26) + 65);
                    code += ch;
                    break;
                case 1:
                    //小写字符
                    //大写字符(a -> 97  ---- Z 97+25) (0 - 25) + 97
                    char ch1 = (char) (r.nextInt(26) + 97);
                    code += ch1;
                    break;
                case 2:
                    //数字字符
                    code += r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
