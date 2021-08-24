package com.tky.chapter14.collection;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/24 21:13
 */
public class Collection_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
//        Collection
//        Map

        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");
        arrayList.add("tky");
        System.out.println(arrayList);

        HashMap hashMap = new HashMap();
        hashMap.put("No1", "北京");
        hashMap.put("No2", "上海");
        hashMap.put("No3", "广州");
        System.out.println(hashMap);
    }
}
