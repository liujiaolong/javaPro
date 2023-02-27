package com.dragon.d8_genericity_class;

public class Test {
    public static void main(String[] args) {
        //需求：模拟ArrayList定义一个MyArrayList，关注泛型设计
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Java");
        myArrayList.remove("Java");

        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();
        myArrayList2.add(123);
        myArrayList2.add(558);
        myArrayList2.remove(123);
    }
}
