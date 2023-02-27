package com.dragon.d8_innerclass_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    目标：通过GUI图形界面编程，理解匿名内部类的真实使用场景
 */
public class Test3 {
    public static void main(String[] args) {
        // 1、创建窗口
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel(); //创建桌布
        win.add(panel);
        //2、创建一个按钮对象
        JButton btn = new JButton("登录");

        //注意：讲解匿名内部类的使用
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win , "点我一下说明爱我！");
            }
        });

        //3、把按钮对象添加到桌布上展示
        panel.add(btn);

        //4、展示窗口
        win.setSize(400,300);
        win.setLocationRelativeTo(null); //居中
        win.setVisible(true);


    }
}
