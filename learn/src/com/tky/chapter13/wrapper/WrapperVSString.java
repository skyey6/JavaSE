package com.tky.chapter13.wrapper;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/22 17:12
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //Integer -> String
        Integer i = 100;
        String str1 = i + "";   //方式1
        String str2 = String.valueOf(i);    //方式2
        String str3 = i.toString(); //方式3

        //String -> Integer
        String s = "12345";
        Integer integer1 = Integer.valueOf(s);
        Integer integer2 = new Integer(s);
    }
}
