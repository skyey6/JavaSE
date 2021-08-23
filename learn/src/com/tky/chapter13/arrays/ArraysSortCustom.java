package com.tky.chapter13.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/23 20:24
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1,-1,8,0,20};
//        bubble(arr);
        System.out.println(Arrays.toString(arr));

        bubble(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer)o2 - (Integer)o1;
            }
        });
        System.out.println(Arrays.toString(arr));

    }

    public static int[] bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                //从小到大排序
                if (arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //定制冒泡排序
    public static int[] bubble(int[] arr, Comparator c) {
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                //数组排序由 c.compare(arr[j], arr[j+1])返回的值决定
                if (c.compare(arr[j],arr[j+1]) > 0){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
