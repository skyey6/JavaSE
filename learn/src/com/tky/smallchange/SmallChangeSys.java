package com.tky.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    public static void main(String[] args) {
        /*
            零钱通菜单
         */
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        String key = "";    //保存用户的选择
        String detail = "----------------零钱通明细----------------";    //后续用来进行字符串拼接
        double money = 0;  //收益 or 支出
        double balance = 0; //余额
        String note = "";   //记录消费说明
        Date date;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   //用于日期格式化

        do {
            System.out.println("\n=============零钱通菜单=============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");
            System.out.println("===================================");
            System.out.print("请选择(1-4): ");
            key = scan.next();
            switch (key) {
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money = scan.nextDouble();
                    /*
                    对money的值的范围进行校验
                     */
                    if (money <= 0) {   //如果不正确，则重来
                        System.out.println("收益入账金额需要大于0");
                        break;
                    }
                    //余额增加
                    balance += money;
                    //获取当前日期
                    date = new Date();
                    //拼接零钱通明细
                    detail += "\n收益入账\t" + "+" + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
                    break;
                case "3":
                    System.out.print("消费金额：");
                    money = scan.nextDouble();
                    /*
                    对money的值的范围进行校验
                     */
                    if (money <= 0 || money > balance) {   //如果不正确，则重来
                        System.out.println("消费金额需要大于0 \\ 消费金额不能大于余额");
                        break;
                    }
                    //余额减少
                    balance -= money;
                    //记录消费说明
                    System.out.print("消费说明：");
                    scan = new Scanner(System.in);
                    note = scan.nextLine();
                    //获取当前日期
                    date = new Date();
                    //拼接零钱通明细
                    detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
                    break;
                case "4":
                    String choice;
                    do {    //要求用户输入y or n
                        System.out.print("你确定要退出吗？(y/n) ");
                        choice = scan.next();
                        if (choice.toLowerCase().equals("y") || choice.toLowerCase().equals("n")) {
                            break;  //如果输入了y or n，才退出这个do while循环
                        } else {
                            System.out.println("输入异常，请重新选择(y/n) ");
                        }
                    } while (true);
                    if (choice.toLowerCase().equals("y")) {  //如果选择是y，才退出系统
                        flag = false;
                    }
                    break;
                default:
                    System.out.println("输入异常，请选择(1-4)...");
            }

        } while (flag);

        System.out.println("退出系统...");
    }
}
