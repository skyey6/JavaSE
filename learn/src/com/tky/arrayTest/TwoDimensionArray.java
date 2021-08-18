package com.tky.arrayTest;

import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要打印的杨辉三角的行数：");
        int line = scanner.nextInt();

        int[][] arr = new int[line][];
        for (int i = 0; i < line; i++) {
            arr[i] = new int[i+1];
        }//二维数组初始化

        arr[0][0] = 1;
        arr[1][0] = 1;  arr[1][1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i][0] = 1;
            arr[i][arr[i].length-1] = 1;
            for (int j = 1; j < arr[i].length-1; j++) {
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }//赋值

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }//打印二维数组


    }
}
