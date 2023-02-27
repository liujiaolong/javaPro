package com.dragon;

import java.util.Random;
import java.util.Scanner;

public class ShuangSeQiu {
    public static void main(String[] args) {
        //1、随机6个红球好吗（1-33，不能重复），随机一个篮球号码（1-16）
        //   可以采用数组装起来作为中奖号码，一共7个号码
        int[] luckNumbers = createLuckNumber();
        printArray(luckNumbers);
        //2、让用户输入7个号码 作为用户选号
        int[] userNumbers = userInputNumber();
        printArray(userNumbers);
        //3、判断是否中奖
        judge(luckNumbers,userNumbers);


    }
    //随机生成中奖号码
    public static int[] createLuckNumber(){
        int[] numbers = new int[7];
        Random r = new Random();
        //红球号码
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true){
                int data = r.nextInt(33) + 1; // 1-33 =====> （0--32） + 1
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == data){
                        //data 当前这个数据之前出现过，不能用
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    //data 这个数据之前没有出现过，可以使用了
                    numbers[i] = data;
                    break;
                }
            }
        }
        //创建第7个位置生成一个1-16的好吗作为篮球号码
        numbers[numbers.length - 1] = r.nextInt(16) + 1;
        return numbers;
    }

    //用户输入一组双色球号码
    public static int[] userInputNumber(){
        int[] userNumbers = new int[7];
        Scanner sc = new Scanner(System.in);
        //输入前6个红色号码
        for (int i = 0; i < userNumbers.length - 1; i++) {
//            System.out.println("请您输入第"+ (i+1) +"个红球号码(1-33)：");
//            int data = sc.nextInt();
            //可以优化判断数字是否符合规则
            int idx = i + 1;
            while (true){
                System.out.println("请您输入第"+ idx +"个红球号码(1-33)：");
                int data = sc.nextInt();
                if (data < 1 || data > 33){
                    System.out.println("您输入号码不符合规则，请重新输入！");
                }else{
                    userNumbers[i] = data;
                    break;
                }
            }
        }
        System.out.println("请您输入篮球号码(1-16)：");
        userNumbers[userNumbers.length - 1] = sc.nextInt();
        return userNumbers;
    }

    //判断是否中奖
    public static void judge(int[] luckNumbers , int[] userNumbers){
        int redHitNumbers = 0; //红球命中个数
        int blueHitNumbers = 0;//篮球命中个数
        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckNumbers.length - 1; j++) {
                //每次找到了相等了，就意味着当前号码命中了
                if (userNumbers[i] == luckNumbers[j]){
                    redHitNumbers ++;
                    break; //结束内部当前循环
                }
            }
        }
//        if (luckNumbers[luckNumbers.length-1] == userNumbers[userNumbers.length - 1]){
//            blueHitNumbers = 1;
//        }
        blueHitNumbers = (luckNumbers[luckNumbers.length-1] == userNumbers[userNumbers.length - 1]) ? 1 : 0;

        System.out.println("中奖号码是：" );
        printArray(luckNumbers);
        System.out.println("您投注号码是：");
        printArray(userNumbers);
        System.out.println("您命中了几个红球：" + redHitNumbers);
        System.out.println("您是否命中蓝球：" + (blueHitNumbers == 1 ? "是" : "否"));

        //计算中奖情况
        if (blueHitNumbers == 1 && redHitNumbers < 3){
            System.out.println("恭喜你，中了5元小奖");
        }else if ((blueHitNumbers == 1 && redHitNumbers == 3) || (blueHitNumbers == 0 && redHitNumbers ==4)){
            System.out.println("恭喜你，中了10元小奖");
        }else if ((blueHitNumbers == 1 && redHitNumbers == 4) || (blueHitNumbers == 0 && redHitNumbers ==5)){
            System.out.println("恭喜你，中了200元奖");
        }else if (blueHitNumbers == 1 && redHitNumbers == 5){
            System.out.println("恭喜你，中了3000元奖");
        }else if (blueHitNumbers == 0 && redHitNumbers == 6){
            System.out.println("恭喜你，中了500万元超级大奖");
        }else if (blueHitNumbers == 1 && redHitNumbers == 6){
            System.out.println("恭喜你，中了1000万元巨奖");
        }else{
            System.out.println("很遗憾，感谢您为福利彩票事业做出突出贡献~~~");
        }
    }

    //打印数组
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
