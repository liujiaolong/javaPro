package com.dragon.d9_api_object;
/*
    目标：掌握object类中toString方法的使用
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student("周雄" , '男' , 19);
        String rs = s.toString();
        System.out.println(rs); //com.dragon.d9_api_object.Student@1b6d3586

        //直接输出对象变量，默认可以省略toString调用不写的
        System.out.println(s);
    }
}
