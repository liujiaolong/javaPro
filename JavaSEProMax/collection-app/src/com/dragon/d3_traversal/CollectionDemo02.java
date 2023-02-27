package com.dragon.d3_traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("小昭");
        lists.add("素素");
        lists.add("灭绝");
        System.out.println(lists);

        //快捷方式生成循环体：lists.for，然后回车即可

        for (String ele : lists){
            System.out.println(ele);
        }

        System.out.println("------遍历数组-------");
        double[] scores = {100, 99, 59.5};
        for (double score : scores) {
            System.out.println(score);
            if (score == 59.9){
                score = 100.0;//注意：此处修改无意义，不会影响数组的元素值
            }
        }
        System.out.println(Arrays.toString(scores));//[100.0, 99.0, 59.5]
    }
}
