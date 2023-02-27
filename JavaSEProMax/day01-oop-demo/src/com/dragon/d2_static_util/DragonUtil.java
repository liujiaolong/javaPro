package com.dragon.d2_static_util;

import java.util.Random;

/**
 * 工具类
 * 无需创建对象，建议将工具类的构造器进行私有化
 */
public class DragonUtil {

    /**
     * 注意：由于工具类无需创建对象，所以把其构造器私有化会显得很专业
     */
    private DragonUtil(){
    }
    /**
        静态方法
     @param n 验证码位数
     */
    public static String createVerifyCode(int n){
        //定义一个变量记住验证码
        String code = "";
        //定义一个变量记住全部验证码字符
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //定义一个循环生成几个随机索引，去得到几个字符
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            //获取随机索引对应的字符，连接给code
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }
}
