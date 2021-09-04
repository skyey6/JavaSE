package com.tky.chapter14.map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/4 19:30
 */
public class TreeMap_ {
    public static void main(String[] args) {

        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        //添加数据
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯提诺");
        treeMap.put("smith", "斯密斯");
        treeMap.put("tky", "阿萨德");//加入不了，tom和tky长度都为3，对value进行了更新

        System.out.println("treemap=" + treeMap);

    }
}
