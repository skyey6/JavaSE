package com.tky.chapter13.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/23 18:52
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1,20,90};
        System.out.println(Arrays.toString(integers)); //[1, 20, 90]

        //2. 因为数组是引用类型，所以通过 sort 排序后，会直接影响到传入的 arr
        //3. sort 方法有多个重载，可以通过传入一个接口 Comparator 实现定制排序
        //4. 调用 定制排序 时，传入两个参数 (1) 排序的数组 arr
        //      (2) 实现了 Comparator 接口的匿名内部类, 要求实现 compare 方法
        Integer[] arr = {1,-1,7,0,89};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
                return i2 - i1; //影响排序顺序
            }
        });
        System.out.println(Arrays.toString(arr)); //[-1, 0, 1, 7, 89]

    }
}
