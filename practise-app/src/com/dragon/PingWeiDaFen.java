package com.dragon;

import java.util.Scanner;

//评委打分
public class PingWeiDaFen {
    public static void main(String[] args) {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请您输入第" + (i+1) + "个评委的打分");
            int score = sc.nextInt();
            scores[i] = score;
        }
        int maxScore = scores[0];
        int minScore = scores[0];
        int sumScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore){ //最大分
                maxScore = scores[i];
            }
            if (scores[i]< minScore){ //最小分
                minScore = scores[i];
            }
            sumScore += scores[i]; //总分
        }
        System.out.println("最高分是：" + maxScore);
        System.out.println("最低分是：" + minScore);
        //统计平均分
        double res = (sumScore - maxScore - minScore) * 1.0 / (scores.length - 2); //乘0.1为了精确到小数
        System.out.println("选手最终得分是：" + res);
    }
}
