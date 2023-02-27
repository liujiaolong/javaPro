package com.dragon.d2_static_util;

/**
 * 模拟校验
 */
public class Check {
    public static void main(String[] args) {
        String code = DragonUtil.createVerifyCode(10);
        System.out.println("验证码：" + code);
    }
}
