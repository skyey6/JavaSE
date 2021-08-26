package com.tky.chapter14.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/26 17:06
 */
public class ListFor {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("kate");
        list.add("tky");

        //遍历
        //1.迭代器
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            System.out.println(o);
        }

        System.out.println("================");
        //2.增强for
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("================");
        //3.普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
