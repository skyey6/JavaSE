package com.tky.chapter12.exception_;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/21 11:17
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String str1 = "1234";
        int i1 = Integer.parseInt(str1);
        System.out.println(i1);

        String str2 = "tky";
        int i2 = Integer.parseInt(str2); //NumberFormatException
        System.out.println(i2);
    }
}
