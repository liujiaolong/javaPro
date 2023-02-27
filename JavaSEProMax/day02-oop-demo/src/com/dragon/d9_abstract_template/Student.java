package com.dragon.d9_abstract_template;

public abstract class Student {
    /*
        正式：声明了模板方法模式
     */
    public final void write(){
        System.out.println("\t\t\t\t《我的爸爸》");
        System.out.println("你的爸爸是啥样，来说说：");
        //正文部分（每个子类都要写的，每个子类写的情况不一样）
        //因此模板方法把正文部分定义成抽象方法，交给具体子类来完成
        System.out.println(writeMain());
        //结尾
        System.out.println("我的爸爸简直太好了~~~");
    }

    public abstract String writeMain();
}
