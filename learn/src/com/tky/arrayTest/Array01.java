package com.tky.arrayTest;

public class Array01 {
    public static void main(String[] args) {
        //求6只鸡的平均体重
        double[] arr = new double[6];
        double sum = 0;
        arr[0] = 3;
        arr[1] = 6;
        arr[2] = 1;
        arr[3] = 3.4;
        arr[4] = 2;
        arr[5] = 50;
        for (double i: arr) {
            sum += i;
        }
        System.out.println("总体重：" + sum + "kg，"
                + "平均体重：" + sum/arr.length + "kg.");
    }
}
