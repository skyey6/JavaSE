package com.tky.chapter14.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/26 15:55
 */
public class List_ {
    public static void main(String[] args) {
        //1. List 集合类中元素有序(即添加顺序和取出顺序一致)、且可重复 [案例]
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("tky");
        list.add("jack");
        System.out.println("list=" + list);

        //2. List 集合中的每个元素都有其对应的顺序索引，即支持索引 (从0开始)
        System.out.println(list.get(2)); //tky

    }
}
