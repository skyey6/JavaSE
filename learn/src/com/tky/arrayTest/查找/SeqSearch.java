package com.tky.arrayTest.查找;

import java.util.Arrays;

public class SeqSearch {
    public static void main(String[] args) {
        int[] arr = {10,30,40,100};
        int res = Arrays.binarySearch(arr, 30);
        System.out.println(res);

        //顺序查找
        String[] names = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        int index = -1;
        String name = "金毛狮王";
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])){
                System.out.println(i);
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("未找到");
        }

    }
}
