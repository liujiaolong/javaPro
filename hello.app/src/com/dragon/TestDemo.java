package com.dragon;

import java.util.Random;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //需求 拆分3位数，把个位，十位，百分分别输出
//        int data = 589;
//
//        int ge = data % 10; //个位
//        System.out.println(ge);
//
//        int shi = data / 10 % 10; //十位
//        System.out.println(shi);
//
//        int bai  = data / 100; //百位
//        System.out.println(bai);
//
//        int a = 5;
//        System.out.println("abc" + a); // abc5
//        System.out.println("abc" + 'a'); //abca
//        System.out.println(5 + a); //10
//        System.out.println(a + 'a'); //102
//        System.out.println(a +  "" + 'a'); //5a
//        System.out.println(a + 'a' + "itemima");//102itemima
//        System.out.println("itemima" + a + 'a');//itemima5a
//        System.out.println("itemima" + (a + 'a'));//itemima102

//        int a = 10;
//        a++; // a = a + 1; --->11
//        ++a; //a = a + 1; ----> 11
//        System.out.println(a);

        //放在变量的前面，先对变量进行 +1 、-1，再拿变量的值进行运算
//        int a = 10;
//        int rs = ++a;
//        System.out.println(a); //11
//        System.out.println(rs); //11
//        //放在变量的后面，先拿变量的值进行运算，再对变量的值进行+1 、-1
//        int b = 10;
//        int rs = b++;
//        System.out.println(b); //11
//        System.out.println(rs); //10


//        int k = 3;
//        int p = 5;
//        // k 3  4  5  4
//        // p 5  4  3  4
//        // rs 3 + 5 - 4 + 4 - 5 + 4 + 2
//        int rs = k++ + ++k - --p + p-- - k-- + ++p + 2;
//        System.out.println(k); //4
//        System.out.println(p); //4
//        System.out.println(rs); //9

        //使用赋值运算符：=+ -= *= /= %=
//        int a = 10;
//        int b = 200;
//        a += b; // a = (int)(a+b)
//        System.out.println(a); //210
//
//        byte i = 10;
//        byte j = 20;
//        i += j; //i = (byte) (i + j);
//        System.out.println(i); //30
        //学会使用关系运算符
//        int a = 10;
//        int b = 5;
//        boolean rs = a == b;
//        System.out.println(rs); //true
//        //还有以下这种方式
//        System.out.println(a == b); //true
//        System.out.println(a > b); //false
//
//        System.out.println(a = b);//5

        //学会使用逻辑运算符，并能够选择合适的逻辑运算符解决问题
//        double size = 9.8;
//        double storage = 16;
//        //需求，尺寸大于等于6.95.内存要大于等于8GB
//        boolean res = size >= 6.95 & storage >= 8;
//        System.out.println(res);

        // && & || |的区别
//        int a = 10;
//        int b = 20;
//        System.out.println(a > 100 && ++b > 10);// false
//        System.out.println(b); //20
//        System.out.println("------------------");
//        System.out.println(a > 100 & ++b > 10);// false
//        System.out.println(b); //21

//        学会使用三元运算符，理解其流程
//        double score = 98;
//        String res = score >= 60 ? "考试通过" : "挂科";
//        System.out.println(res);
        //需要从2个整数中找出最大值
//        int a = 10;
//        int b = 2000;
//        int max = a > b ? a : b;
//        System.out.println(max);

        //找出2个整数的较大值，拿临时变量与第三个变量的值继续比较
//        int i = 10;
//        int j = 30;
//        int k = 50;
//        //找出2个整数的较大值
//        int temp = i > j ? i : j;
//        //拿临时变量与第三个变量的值进行比较
//        int resMax = temp > k ? temp : k;
//        System.out.println(resMax); //50
//
//        System.out.println("---------拓展知识（三元运算符嵌套）-------");
//        int resMax1 = i > j ? (i > k ? i : k) : (j > k ? j : k);
//        System.out.println(resMax1); //50

        //看看java是否存在优先级，注意优先级问题
//        System.out.println(10 > 3 || 10 > 3 && 10 < 3); //true
//        System.out.println((10 > 3 || 10 > 3) && 10 < 3); //false
        //格式1：if(条件表达式){ 代码... }
//        int heartBeat = 30;
//        if (heartBeat < 60 || heartBeat > 100){
//            System.out.println("您的心跳数据是：" + heartBeat + "，您可能进一步检查！");
//        }
//        //格式2
//          double money = 5999;
//          if (money >= 1314){
//              System.out.println("您当前发送红包成功~");
//          }else{
//              System.out.println("您自己都没有钱了，就别发了~");
//          }
//        //格式3 if(条件表达式){ 代码.. }else if(条件表达式){ 代码... }else if(条件表达式){ 代码...} ... else{ 代码...}
        //绩效系统：0-60 C 60-80 B 80-90 A 90-100 A+
//        int score = 99;
//        if (score >= 0 && score < 60){
//            System.out.println("您本月绩效是：C");
//        }else if (score >= 60 && score < 80){
//            System.out.println("您本月绩效是：B");
//        }else if (score >= 80 && score < 90){
//            System.out.println("您本月绩效是：A");
//        }else if (score >= 90 && score <= 100){
//            System.out.println("您本月绩效是：A+");
//        }else{
//            System.out.println("录入的分数有毛病!");
//        }

//        需求：
//        周一：埋头苦干；
//        周二：请求大牛程序员帮忙；
//        周三：今晚啤酒、龙虾、小烧烤；
//        周四：主动帮助新来的女程序解决bug；
//        周五：今晚吃鸡；
//        周六：与王婆介绍的小芳相亲；
//        周日：郁郁寡欢，准备上班
        /*String weekday = "周三";
        switch (weekday){
            case "周一":
                System.out.println("埋头苦干");
                break;
            case "周二":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周三":
                System.out.println("今晚啤酒、龙虾、小烧烤");
                break;
            case "周四":
                System.out.println("主动帮助新来的女程序解决bug");
                break;
            case "周五":
                System.out.println("今晚吃鸡");
                break;
            case "周六":
                System.out.println("与王婆介绍的小芳相亲");
                break;
            case "周日":
                System.out.println("郁郁寡欢，准备上班");
                break;
            default:
                System.out.println("数据有误");
        }*/
//        double a = 20;
//        switch (a){
//
//        }

        //需求：用户输入月份可以展示该月份的天数
        //1、3、5、7、8、10、12月份是 31 天
        //2月份是闰年为29天，非闰年是28天
        //4、6、9、11月份是 30 天
//        int month = 7;
//        switch (month){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println(month + "月是31天！");
//                break;
//            case 2:
//                System.out.println(month + "月闰年为29天、非闰年为28天！");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println(month + "月是30天！");
//                break;
//            default:
//                System.out.println(month + "数据有误！");
//        }
//        for (int i = 0; i < 3; i++){
//            System.out.println("Hello World");
//        }
        //需求：求1-5之间的数据和，并把求和结果在控制台输出
//        int sum = 0;
//        for (int i = 1;i <= 5; i++){
//            sum += i;
//        }
//        System.out.println("sum :" + sum);
        //需求：求奇数和

//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 1) {
//                sum += i;
//            }
//        }
//        System.out.println("1-10的奇数和：" + sum);

//        //方式2
//        int sum = 0;
//        for (int i = 1; i <= 10; i+=2) {
//            sum += i;
//        }
//        System.out.println("1-10的奇数和：" + sum);
        // 需求，在控制台输出所有的 “水仙花数” ，水仙花数必须满足如下2个要求
        // 1、水仙花数是一个三位数
        // 2、水仙花数的个位、十位、百位的数字立方和等于原数
        // 3、计算水仙花的数量

        //
//        int i = 0;
//        while (i < 3){
//            System.out.println("hello world");
//            i++;
//        }

        //需求：珠穆拉玛峰高度是884860 纸张厚度 0.1 折叠纸张直到不低于珠穆朗玛峰位置，求折叠几次
//        double peakHeight = 8848860;
//        double paperThickness = 0.1;
//        int count = 0;
//        while (paperThickness < peakHeight){
//            paperThickness *= 2;
//            count++;
//        }
//        System.out.println("折叠的次数：" + count);//24
//        System.out.println("纸张的最终厚度：" + paperThickness);//1.34217728E7
//        int i = 0;
//        do {
//            System.out.println("hello world");
//            i++;
//        }while (i < 3);
//        for (;;){
//            System.out.println("hello world");
//        }
//        //经典做法
//        while (true){
//            System.out.println("hello world");
//        }
//        do {
//            System.out.println("hello world");
//        }while (true);

        //需求：系统密码是520，请用户不断的输入密码验证，验证不对输出密码错误，验证成功输出欢迎进入系统，并停止程序
//        int okPassword = 520; //正确密码
//        Scanner sc = new Scanner(System.in);
//        while (true){
//            System.out.println("请您输入正确密码：");
//            int password = sc.nextInt();
//            if (password == okPassword){
//                System.out.println("登录成功了~~~");
//                break;
//            }else {
//                System.out.println("密码错误！");
//            }
//        }
        //需求：假如你有老婆，然后你犯错了，你老婆罚你说5天，每天3句我爱你
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0 ; j < 3; j++){
//                System.out.println("老婆，我爱你！");
//            }
//        }
        //需求：假如你又有老婆了，然后你犯错了，你老婆罚你5天家务，每天都是洗碗。但是洗碗到第三天后心软你不用洗了
//        for (int i = 0; i < 5; i++) {
//            System.out.println("快乐的洗碗~~~");
//            if (i == 2){
//                break; //跳出并结束当前的循环
//            }
//        }
        //需求：假如你又有老婆了，然后你犯错了，你老婆罚你5天家务，每天都是洗碗。但是洗碗到第三天后心软你不用洗了,但是依然不解恨，继续洗第4天 5天
//        for (int i = 1; i <= 5; i++) {
//            if (i == 3){
//                continue; //立即跳出当次执行，进入循环下一次
//            }
//            System.out.println("洗碗：" + i);
//        }
        // 随机生成1-10随机数
        Random rn = new Random();

//        int n = rn.nextInt(20) + 11;
//        System.out.println(n);
        //随机生成10-20随机数
        //10-20 ====> -10 ====> (0-10) + 10
//        int n = rn.nextInt(11) + 10;
//        System.out.println(n);

//        //3-17的随机数
//        // 3 - 17 ===> -3 ===> (0-14)+3
//        int n = rn.nextInt(15) + 3;
//        System.out.println(n);
        int luckNum  = rn.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请您输入猜测的数据（1-100）：");
            int guessNumber = sc.nextInt();
            if (guessNumber > luckNum){
                System.out.println("您猜测的数据过大~");
            }else if (guessNumber < luckNum){
                System.out.println("您猜测的数据过小~");
            }else{
                System.out.println("恭喜您，猜中了，可以去买单了~");
                break;
            }
        }

    }
}
