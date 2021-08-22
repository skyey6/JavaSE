package com.tky.chapter13.wrapper;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/22 16:52
 */
public class Integer01 {
    public static void main(String[] args) {
        //jdk5以前：手动装箱拆箱

        //装箱 int -> Integer
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //拆箱 Integer -> int
        int i = integer.intValue();

        //自动装箱和拆箱
        Integer integer2 = 5;
        int i1 = integer2;

        Object obj = true? new Integer(1): new Double(2);
        System.out.println(obj);    // 1.0
    }
}
