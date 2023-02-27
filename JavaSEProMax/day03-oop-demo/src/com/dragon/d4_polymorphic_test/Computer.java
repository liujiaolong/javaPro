package com.dragon.d4_polymorphic_test;
/*
    电脑
 */
public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println(name + "开机了~~~");
    }

    /*
        提供安装USB设备的入口
     */
    public void installUSB(USB usb){
        //多态 usb , 可能是鼠标，可能是键盘
        usb.connect(); //接入
        if (usb instanceof KeyBoard){
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        }else if (usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.dbClick();
        }
        usb.unconnect(); //拔出
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
