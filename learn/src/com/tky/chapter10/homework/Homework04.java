package com.tky.chapter10.homework;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/19 20:54
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        }, 88, 5);

        Cellphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 88, 5);
    }
}

interface Calculator {
    double work(double n1, double n2);
}

class Cellphone {
    public static void testWork(Calculator cal, double n1, double n2) {
        double result = cal.work(n1, n2);
        System.out.println("计算结果为：" + result);
    }
}


