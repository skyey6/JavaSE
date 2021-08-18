package com.tky.arrayTest.排序;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {24,69,80,57,13,30,-110};
        int temp;   //用于交换的缓存
        boolean flag;   //记录本趟是否发生交换
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            flag = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                    count++;
                }
            }
            if (!flag) {break;}
        }
        System.out.print("[ ");
        for (int item: arr) {
            System.out.print(item + " ");
        }
        System.out.println("]");
        System.out.println("交换次数：" + count);


    }
}
