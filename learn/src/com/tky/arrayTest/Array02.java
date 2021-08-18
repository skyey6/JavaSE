package com.tky.arrayTest;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        //数组的定义方式
        /*int[] arr1 = {1,2,3,4,5};    //静态初始化
        int[] arr2 = new int[5];    //动态初始化1

        //动态初始化2
        int[] arr3; //先声明数组
        arr3 = new int[5];  //再创建数组*/

        //数组拷贝
        /*int[] arr1 = {10, 20, 30};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int item: arr2) {
            System.out.print(item + " ");
        }*/

        //数组反转
        /*
        * 思路：
        * arr[0]和arr[5]交换
        * arr[1]和arr[4]交换
        * arr[2]和arr[3]交换
        * 交换次数：arr.length/2
        * */
        int temp = 0;
        int[] arr = {11,35,2,98,66,34};
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;
        }
        for (int item: arr) {
            System.out.print(item + " ");
        }
        int[] arrNew = Arrays.copyOf(arr, 10);  //数组扩容
        for (int item: arrNew) {
            System.out.print(item + " ");
        }
    }
}
