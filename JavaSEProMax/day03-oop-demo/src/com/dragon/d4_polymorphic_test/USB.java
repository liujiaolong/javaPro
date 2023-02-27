package com.dragon.d4_polymorphic_test;
/*
    USB接口 == 规范
 */
public interface USB {
    //接入
    void connect();
    // 拔出
    void unconnect();
}
