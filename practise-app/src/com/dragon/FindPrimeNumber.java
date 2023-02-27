package com.dragon;

//找素数
public class FindPrimeNumber {
    //素数：如果除了1和它本身以外，不能被其他正整数整除，就叫素数
    public static void main(String[] args) {
        for (int i = 101; i <= 200 ; i++) {
            //信号位：标记
            boolean flag = true; //一开始认为当前数据是素数
            for (int j = 2; j < i/2; j++) {

                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(i + "\t");
            }
        }
    }
}
