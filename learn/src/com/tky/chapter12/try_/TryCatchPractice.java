package com.tky.chapter12.try_;

import java.util.Scanner;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/21 17:13
 */
public class TryCatchPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        do {
            System.out.print("请输入一个整数：");
            try {
                num = Integer.parseInt(scanner.nextLine()); //可能出现异常
                break;  //未出现异常则会跳出循环
            } catch (NumberFormatException e) {
                System.out.println("输入错误，"+e.getMessage()+"，请重新输入...");
            }
        } while (true);

        System.out.println("输入的整数为：" + num);
    }
}
