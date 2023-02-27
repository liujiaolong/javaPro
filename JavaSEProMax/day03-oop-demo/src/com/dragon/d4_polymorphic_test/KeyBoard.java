package com.dragon.d4_polymorphic_test;
/*
    实现类：键盘
 */
public class KeyBoard implements USB{
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
        独有功能：
     */
    public void keyDown(){
        System.out.println(name + "敲击了：来了，老弟，666~~~~");
    }

    @Override
    public void connect() {
        System.out.println(name + "成功连接电脑~~~");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功从电脑中拔出~~~");
    }
}
