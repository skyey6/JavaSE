package com.tky.chapter13.bignum;

import java.math.BigDecimal;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/24 12:46
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        //需要保存一个精度很高的数时，double 不够用，可以用 BigDecimal
        double d = 2021.123111111111889999d;
        System.out.println(d); //

        BigDecimal bigD1 = new BigDecimal("2021.123111111111889999");
        BigDecimal bigD2 = new BigDecimal("1.1");
        System.out.println(bigD1);

        //1. 如果对 BigDecimal 进行运算，比如加减乘除，需要使用对应的方法
        //2. 创建一个需要操作的 BigDecimal 然后调用相应的方法即可
        System.out.println(bigD1.add(bigD2));
        System.out.println(bigD1.subtract(bigD2));
        System.out.println(bigD1.multiply(bigD2));
//        System.out.println(bigD1.divide(bigD2));//可能抛出异常 ArithmeticException
        //解决方案：
        // 在调用 divide 方法时，指定精度即可。BigDecimal.ROUND_CEILING
        // 如果有无限循环小数，就会保留到 分子 的精度
        System.out.println(bigD1.divide(bigD2, BigDecimal.ROUND_CEILING));
    }
}
