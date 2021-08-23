package com.tky.chapter13.stringbuffer;

import java.util.Scanner;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/23 16:49
 */

/*
    输入商品名称和商品价格，要求打印效果示例, 使用前面学习的方法完成：
    商品名 商品价格
    手机   123,564.59 //比如 价格 3,456,789.88

    要求：价格的小数点前面每三位用逗号隔开, 再输出。
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        System.out.print("输入商品价格：");
        Scanner scan = new Scanner(System.in);
        String price = scan.next();
        try {
            Double.parseDouble(price);
        }catch (NumberFormatException e){
            System.out.print("输入的数字格式有误  ");
            System.out.println(e.getMessage());
            return;
        }
        int len = price.split("\\.")[0].length();

        StringBuffer buffer = new StringBuffer(price);
        for (int i = len-3; i > 0; i-=3) {
            buffer.insert(i,",");
        }
        System.out.println(buffer);

    }
}
