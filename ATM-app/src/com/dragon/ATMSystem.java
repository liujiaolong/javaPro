package com.dragon;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *  ATM 系统入口类
 * */
public class ATMSystem {
    public static void main(String[] args) {
        //1、定义账户类

        //2、定义一个集合容器，负责以后存储全部的账户对象，进行相关业务操作
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in); //扫描器

        //3、展示系统的首页
        while (true) {
            System.out.println("===========黑马银行ATM系统==============");
            System.out.println("1、账户登录");
            System.out.println("2、账户开户");
            System.out.println("请您选择操作：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //用户登录
                    login(accounts , sc);
                    break;
                case 2:
                    //用户账户开户
                    register(accounts , sc);
                    break;
                default:
                    System.out.println("您输入的操作命令不存在");
            }
        }
    }

    /***
     * 用户登录
     * @param accounts 全部账户集合
     * @param sc 扫描器
     */
    private static void login(ArrayList<Account> accounts , Scanner sc) {

        while (true) {
            System.out.println("==============欢迎进入黑马银行ATM系统登录界面=================");
            //如果全部账户0个人，则需要提示先注册
            if (accounts.size() == 0){
                System.out.println("当前0账户，需要先注册");
                return;
            }
            System.out.println("请您输入您的卡号：");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId , accounts);
            if (acc == null){
                System.out.println("卡号有误，不存在该卡号");
                return;
            }else{
                //找到该对象
                System.out.println("请输入您的密码：");
                String passWord = sc.next();
                if (acc.getPassWord().equals(passWord)){
                    //登录成功
                    System.out.println("尊敬的" + acc.getUserName() + "贵宾，欢迎您进入系统，您的卡号是：" + acc.getCardId());
                    showUserCommand(acc , sc , accounts);
                    return;
                }else{
                    System.out.println("您输入的密码有误，请确认~");
                }
            }
        }
    }

    /**
     * ATM 用户操作页
     * @param acc 用户对象
     * @param sc 扫描器
     */
    private static void showUserCommand(Account acc , Scanner sc , ArrayList<Account> accounts) {
        while (true) {
            System.out.println("==========欢迎您进入黑马银行用户操作界面============");
            System.out.println("1、查询");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改密码");
            System.out.println("6、退出");
            System.out.println("7、注销当前账户");
            System.out.println("您可继续选择功能进行操作了：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    //查询
                    showUserData(acc);
                    break;
                case 2:
                    //存款
                    userAddMoney(acc , sc);
                    break;
                case 3:
                    //取款
                    userDrawMoney(acc , sc);
                    break;
                case 4:
                    //转账
                    transferAccount(acc , sc , accounts);
                    break;
                case 5:
                    modifyPassword(acc , sc);
                    //修改密码成功后，调转到首页
                    return;
                case 6:
                    //退出
                    System.out.println("确定要退出吗？Y/N");
                    String out = sc.next().toUpperCase(); //小写转大写
                    if (out.equals("Y")){
                        return;
                    }
                    break;
                case 7:
                    //注销当前账户
                    boolean cancellationFlag =  cancellationAcc(accounts , acc , sc);
                    if (cancellationFlag){ //注销成功
                        return;
                    }
                    break;
                default:
                    System.out.println("您的输入有误，请重新选择");
            }
        }
    }

    /**
     * 注销账户
     * @param acc
     */
    private static boolean cancellationAcc(ArrayList<Account> accounts, Account acc , Scanner sc) {
        System.out.println("==========欢迎您进入黑马银行用户注销界面============");
        System.out.println("确定要退出吗？Y/N");
        String cancellationFlag = sc.next(); //小写转大写
        if (cancellationFlag.equals("Y")){
            accounts.remove(acc);
            return true;
        }
        return false;
    }

    /**
     * 修改密码
     * @param acc
     * @param sc
     */
    private static void modifyPassword(Account acc, Scanner sc) {
        System.out.println("==========欢迎您进入黑马银行用户密码修改界面============");
        System.out.println("请输入旧密码");
        String oldPassword = sc.next();
        if (!oldPassword.equals(acc.getPassWord())){
            System.out.println("旧密码输入错误，请确认~~~");
            return;
        }
        System.out.println("请输新密码");
        String newPassword = sc.next();
        acc.setPassWord(newPassword);
        System.out.println("密码修改成功~~~");
    }

    /**
     * 用户转账
     * @param acc 用户对象
     * @param sc 扫描器
     * @param accounts 全部用户集合
     */
    private static void transferAccount(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("==========欢迎您进入黑马银行用户转账界面============");
        if (accounts.size() < 2){
            System.out.println("当前系统，账户不足2个，不能转账~~~");
            return;
        }
        if (acc.getMoney() <= 0){
            System.out.println("您自己都没有钱，就别转了~~~");
        }

        System.out.println("请输入转账卡号：");
        String cardId = sc.next();
        Account sendUserAcc = getAccountByCardId(cardId , accounts);
        if (sendUserAcc == null){
            System.out.println("不存在该账户，请重新确认~~~");
            return;
        }
        //提示对方姓名中第一个字符
        String tempUserName = sendUserAcc.getUserName().substring(1);
        System.out.println("您当前要为*" + tempUserName + "转账");
        System.out.println("请您输入姓氏确认：");
        String nName = sc.next();
        if (!sendUserAcc.getUserName().substring(0,1).equals(nName)){
            System.out.println("您输入的姓氏错误，请确认~~~");
            return;
        }
        /**
        * v 1.1把自己账号所有的钱转到对方卡中去
        * */
        //sendUserAcc.setMoney(sendUserAcc.getMoney() + acc.getMoney());
        // 把自己卡中钱置成0
        //acc.setMoney(0);

        /**
         * v 1.2 灵活转账
         */
        System.out.println("请您输入要转金额：");
        double money = sc.nextDouble();
        if (money > acc.getMoney()){
            System.out.println("转账金额超过余额，请确认~~~");
            return;
        }
        acc.setMoney(acc.getMoney() - money);
        //给转账用户添加转账金额
        sendUserAcc.setMoney(sendUserAcc.getMoney() + acc.getMoney());
        System.out.println("转账成功，请通知对方确认~~~");
        //显示自己账户信息
        showUserData(acc);
    }


    /**
     * 用户取款
     * @param acc 用户对象
     * @param sc 扫描器
     */
    private static void userDrawMoney(Account acc, Scanner sc) {
        System.out.println("==========欢迎您进入黑马银行用户取款界面============");
        System.out.println("请输入您取款金额：");
        double money = sc.nextDouble();
        if (money <= 0){
            System.out.println("请您输入正确取款金额~~~");
        }else{
            if (money > acc.getQuotaMoney()){
                System.out.println("您当前取款超过当次限额~~~");
                return;
            }

            if (money > acc.getMoney()){
                System.out.println("您的账户余额不足~~~");
                return;
            }
            //取款成功
            acc.setMoney(acc.getMoney() - money);
            System.out.println("您已取款成功~~~");
            showUserData(acc);
        }
    }

    /**
     * 用户存款
     * @param acc 用户对象
     * @param sc 扫描器
     */
    private static void userAddMoney(Account acc , Scanner sc) {
        System.out.println("==========欢迎您进入黑马银行用户存款界面============");
        System.out.println("请您输入存款金额：");
        double money = sc.nextDouble();
        if (money <= 0){
            System.out.println("请您输入正确存款金额~~~");
        }else{
            acc.setMoney(acc.getMoney() + money);
            System.out.println("您已存款成功~~~");
            showUserData(acc);
        }
    }

    /**
     * 用户信息详情界面
     * @param acc 用户对象
     */
    private static void showUserData(Account acc) {
        System.out.println("==========欢迎您进入黑马银行用户详情界面=============");
        System.out.println("您的账户信息如下：");
        System.out.println("卡号：" + acc.getCardId());
        System.out.println("姓名：" + acc.getUserName());
        System.out.println("金额：" + acc.getMoney());
        System.out.println("当次取现额度：" + acc.getQuotaMoney());
    }

    /***
     * 用户开户功能
     * @param accounts 接收的账户集合
     */
    private static void register(ArrayList<Account> accounts , Scanner sc) {
        System.out.println("==============系统开户操作=================");
        //1、创建一个账户对象，用于后期封装账户信息
        Account account = new Account();
        //2、录入当前这个账户信息，注入到账户对象中去
        System.out.println("请您输入账户用户名：");
        String userName = sc.next();
        account.setUserName(userName);

        while (true) {
            System.out.println("请您输入账户密码：");
            String passWord = sc.next();
            System.out.println("请您输入确认密码：");
            String okPassWord = sc.next();
            if (okPassWord.equals(passWord)){
                //密码正确，认证通过，可以注入给账户对象
                account.setPassWord(okPassWord);
                break;//密码已经录入成功，死循环没有必须继续了
            }else{
                System.out.println("对不起，您输入的2次密码不一致，请重新确认");
            }
        }
        System.out.println("请您输入账户当次限额：");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        //为账户随机一个8位且与其他账户的卡号不重复号码。(独立功能，独立方法)
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);

        //3、把账户对象添加到账户集合中去
        accounts.add(account);
        System.out.println("恭喜您，" + userName + "先生/女士，您开户成功，您的卡号是：" + cardId + "，请您妥善保管卡号！");
    }

    /**
     * 为账户生成8位与其他账户卡号不同的号码
     * @return
     */
    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r = new Random();
        while (true) {
            //1、先生成8位数字
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }
            //2、判断这个8位卡号是否与其他账户的卡号重复了
            //根据这个卡号去查询账户的对象
            Account acc = getAccountByCardId(cardId,accounts);
            if (acc == null){
                //说明cardId 此时没有重复，这个卡号是一个新卡号，可以使用这个卡号作为注册账户卡号
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查询出一个账户对象来
     * @param cardId 卡号
     * @param accounts 全部账户集合
     * @return 账户对象|null
     */
    private static Account getAccountByCardId(String cardId , ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)){
                return acc;
            }
        }
        return null; //查无此账号
    }
}