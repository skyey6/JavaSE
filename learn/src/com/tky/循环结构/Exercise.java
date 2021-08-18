package com.tky.循环结构;

public class Exercise {
    public static void main(String[] args) {
        /*double cash = 100000;
        int count = 0;
        while (true) {
            if (cash-1000 < 0){
                break;
            } else if (cash > 50000){
                cash *= 0.95;
            } else {
                cash -= 1000;
            }
            System.out.println("现金剩余：" + cash);
            count++;
        }
        System.out.println("能够经过" + count + "次路口");*/

        //判断水仙花数
        /*int num = 153;
        int sum = 0;
        sum += (int) (Math.pow(num%10, 3) + Math.pow(num%100/10, 3) + Math.pow(num/100, 3));
        System.out.println(sum);*/

        //输出小写的a-z以及大写的Z-A
        /*for (int i = 'a'; i <= 'z'; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();
        for (int i = 'Z'; i >= 'A'; i--) {
            System.out.print((char)i + " ");
        }*/

        //求1-1/2+1/3-1/4...+1/99-1/100的和
        /*double sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%2 != 0){
                sum += 1.0/i;
            } else {
                sum -= 1.0/i;
            }
        }
        System.out.println(sum);*/

        //求1+(1+2)+(1+2+3)+...+(1+2+3+..+100)
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
