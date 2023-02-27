package com.dragon.d5_collection_list;

import java.util.LinkedList;

public class ListDemo03 {
    public static void main(String[] args) {
        //LinkedList 可以完成队列结构、和栈结构（双向）
        //栈
        LinkedList<String> stack = new LinkedList<>();//因为要用独有功能，所以就不需要多态写法
        //压栈、入栈
        stack.push("第1颗子弹");//等同于：stack.addFirst("第1颗子弹")，push里面做了包装还是addFirst()
        stack.push("第2颗子弹");
        stack.push("第3颗子弹");
        stack.push("第4颗子弹");
        System.out.println(stack);//[第4颗子弹, 第3颗子弹, 第2颗子弹, 第1颗子弹]
        //出栈、弹栈
        //System.out.println(stack.getFirst());//弹出第一个元素
        System.out.println(stack.pop());//第4颗子弹，弹出第一个元素并移除掉  等同于：removeFirst(),pop里面封装了removeFirst
        System.out.println(stack);//[第3颗子弹, 第2颗子弹, 第1颗子弹]

        //队列
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);//[1号, 2号, 3号, 4号]
        //排队
        System.out.println(queue.getFirst());//1号，取出第一个元素
        queue.removeFirst();//1号，取出第一个元素并移除
        System.out.println(queue);//[2号, 3号, 4号]
    }
}
