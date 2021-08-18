package com.tky.循环结构;

import java.util.Scanner;

public class MulForExercise {
    public static void main(String[] args) {
        double[][] score = new double[3][5];
        double sum = 0.0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("请输入" + (i+1) + "班第" + (j+1) + "名学生的成绩: ");
                score[i][j] = scanner.nextDouble();
                System.out.println("成绩为" + score[i][j]);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                sum += score[i][j];
            }
        }

        System.out.println("三个班学生的总分为"+ sum +"，平均分为" + sum/15);

        // 九九乘法表
        /*for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }*/
        
        // 打印空心金字塔
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("输入要打印的金字塔的层数: ");
        int totalLevel = scanner.nextInt();
        for (int i = 1; i <= totalLevel; i++) {
            //输出*之前，需要输入对应数量的空格，空格数=总层数-当前层数
            for (int k = 1; k <= totalLevel-i; k++) {
                System.out.print(" ");
            }
            if (i==1 || i==totalLevel){  //若是第一层或最后一层，正常打印*
                for (int j = 1; j <= 2*i-1; j++) {  //*的个数=2*层数-1
                    System.out.print("*");
                }
            } else {    //若是中间层，只打印两个*，两个*中间是空格
                System.out.print("*");
                for (int j = 1; j <= (i-1)*2-1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }*/

    }
}
