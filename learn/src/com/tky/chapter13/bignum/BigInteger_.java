package com.tky.chapter13.bignum;

import java.math.BigInteger;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/24 12:27
 */
public class BigInteger_ {
    public static void main(String[] args) {
//        long l = 9223372036854775808L;
        //如果需要处理很大的整数，long 不够用，可以使用 BigInteger 类来储存

        BigInteger big1 = new BigInteger("9223372036854775808");
        BigInteger big2 = new BigInteger("102");
        System.out.println(big1);

        //1. 在对 BigInteger 进行加减乘除的时候，需要使用对应的方法，不能直接进行 + - * /
        //2. 可以创建一个 要操作的 BigInteger 然后进行相应操作
        BigInteger add = big1.add(big2); //加
        System.out.println(add);
        BigInteger subtract = big1.subtract(big2); //减
        System.out.println(subtract);
        BigInteger multiply = big1.multiply(big2); //乘
        System.out.println(multiply);
        BigInteger divide = big1.divide(big2); //除
        System.out.println(divide);

    }
}
