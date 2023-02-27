package com.dragon.d1_set;

import java.util.HashSet;
import java.util.Set;

/*
    目标：让Set集合把重复内容的对象去掉一个（去重复）
 */
public class SetDemo3 {
    public static void main(String[] args) {
        //Set集合去重复的原因：先判断哈希值，再判断equals
        //如果想集合里面把对象的重复内容去重，则在javaBean中，手动重写hashCode和equals即可
        Set<Student> sets = new HashSet<>();

        Student s1 = new Student("无恙" , 20 , '男');
        Student s2 = new Student("无恙" , 20 , '男');
        Student s3 = new Student("周雄" , 21 , '男');
        System.out.println(s1.hashCode());//800712763
        System.out.println(s2.hashCode());//800712763
        System.out.println(s3.hashCode());//680875133

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);

        System.out.println(sets);//[Student{name='无恙', age=20, sex=男}, Student{name='周雄', age=21, sex=男}]
        //如果不重写hashCode和equals的话
        System.out.println(sets);//[Student{name='周雄', age=21, sex=男}, Student{name='无恙', age=20, sex=男}, Student{name='无恙', age=20, sex=男}]

    }
}
