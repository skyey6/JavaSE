package com.tky.分支控制;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入：");
//        int age = scanner.nextInt();
//        if (age >= 18){
//            System.out.println("已满18岁");
//        } else {
//            System.out.println("Under 18.");
//        }

//        int credit = scanner.nextInt();
//        if (credit >= 100){
//            System.out.println("信用极好");
//        } else if (credit>80 && credit<=99){
//            System.out.println("信用优秀");
//        } else if (credit<= 80 && credit>=60){
//            System.out.println("信用一般");
//        } else {
//            System.out.println("信用不及格");
//        }

        int i=1;
        int count = 0;
        do {
            if (i%5==0 && i%3!=0){
                count++;
            }
            i++;
        }while(i<=200);
        System.out.println(count);
    }
}
