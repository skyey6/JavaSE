package com.tky.chapter14.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/26 11:32
 */
public class CollectionMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection list = new ArrayList();

        // add:添加单个元素
        list.add("jack");
        list.add(10);   //自动装箱机制
        list.add(true);
        System.out.println("list=" + list);

        // remove:删除指定元素
        Object remove = list.remove(true);//指定删除，返回boolean
        System.out.println("list=" + list);

        // contains:查找元素是否存在，返回boolean
        System.out.println("jack 是否在list中: " + list.contains("jack"));

        // size:获取元素个数
        int i = list.size();
        System.out.println("list中元素个数: "+i); //3

        // isEmpty:判断是否为空
        System.out.println(list.isEmpty()); //false

        // clear:清空
//        list.clear();
        System.out.println(list);

        // addAll:添加多个元素
        List list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list2.add("西游记");
        list2.add("水浒传");
        list.addAll(list2);
        System.out.println(list); //[jack, 10, true, 红楼梦, 三国演义, 西游记, 水浒传]

        // containsAll:查找多个元素是否均存在
        System.out.println(list.containsAll(list2));

        // removeAll:删除多个元素
        list.add("芜湖");
        list.add("蚌埠");
        list.removeAll(list2);
        System.out.println(list); //[jack, 10, true, 芜湖, 蚌埠]

    }
}
