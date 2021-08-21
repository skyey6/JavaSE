package com.tky.chapter12.try_;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/21 16:15
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "tky";
            int a = Integer.parseInt(str); //发生异常
            System.out.println(a);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        System.out.println("Continue...");
    }
}
