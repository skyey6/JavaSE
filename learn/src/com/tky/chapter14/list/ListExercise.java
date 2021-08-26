package com.tky.chapter14.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/26 16:46
 */
public class ListExercise {
    public static void main(String[] args) {
        /* 添加 10 个以上的元素(比如 String "hello" )，在 2 号位插入一个元素"Skyey"，
         * 获得第 5 个元素，删除第 6 个元素，修改第 7 个元素，在使用迭代器遍历集合，
         * 要求:使用 List 的实现类 ArrayList 完成。
         */
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello" + i);
        }
        System.out.println(list);

        list.add(1,"Skyey");
        System.out.println(list);

        System.out.println(list.get(4));

        System.out.println("删除前：" + list);
        list.remove(5);
        System.out.println("删除后：" + list);

        System.out.println("修改前：" + list);
        list.set(6,"芜湖");
        System.out.println("修改后：" + list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o =  iterator.next();
            System.out.println(o);
        }

    }
}
