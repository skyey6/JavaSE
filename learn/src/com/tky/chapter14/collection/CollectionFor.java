package com.tky.chapter14.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/26 15:41
 */
public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book2("三国演义", "罗贯中", 10.1));
        col.add(new Book2("小李飞刀", "古龙", 5.1));
        col.add(new Book2("红楼梦", "曹雪芹", 34.6));

        //使用增强for循环
        for (Object book : col) {
            System.out.println(book);
        }
    }
}
