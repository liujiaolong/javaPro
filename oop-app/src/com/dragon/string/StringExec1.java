package com.dragon.string;

import java.util.Scanner;

public class StringExec1 {
    public static void main(String[] args) {
        //正确登录名和密码
        String okLoginName = "admin";
        String okPassword = "itheima";

        //定义一个循环，循环3次，让用户登录
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请您输入登录名称");
            String loginName = sc.next();

            System.out.println("请您输入登录密码");
            String loginPassword = sc.next();

            //判断登录是否成功
            if (okLoginName.equals(loginName)){
                //判断密码是否正确
                if (okPassword.equals(loginPassword)){
                    System.out.println("登录成功，欢迎进入系统随意浏览");
                    break;
                }else{
                    System.out.println("您的密码不正确，您还剩余" + (3-i) + "机会~~");
                }
            }else{
                System.out.println("登录名称错误了!您还剩余" + (3-i) + "机会~~");
            }
        }
    }
}
