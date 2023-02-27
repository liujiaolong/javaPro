package com.dragon.d2_static_util;

/**
 * 模拟登录
 */
public class Login {
    public static void main(String[] args) {
        //开发一个验证码
        String code = DragonUtil.createVerifyCode(5);
        System.out.println("验证码：" + code);
//        DragonUtil dragonUtil = new DragonUtil();//访问不了，因为工具类不需要实例对象，因此构造器私有化了，
    }
}
