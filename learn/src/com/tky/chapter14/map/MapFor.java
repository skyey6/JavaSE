package com.tky.chapter14.map;

import java.util.*;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/30 21:17
 */
public class MapFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("邓超", "孙俪");//OK
        map.put("王宝强", "马蓉");//OK
        map.put("宋喆", "马蓉");//OK
        map.put("刘令博", null);//OK
        map.put(null, "刘亦菲");//OK
        map.put("鹿晗", "关晓彤");//OK

        System.out.println("map=" + map);

        //方式1：取出所有的key，通过key获取value
        //增强for 或 iterator 均可
        for (Object key : map.keySet()) {
            System.out.println(key + "-" + map.get(key));
        }

        //方式2：如果不关心key，可以直接取出values
        //增强for 或 iterator 均可
        Collection values = map.values();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            Object value = it.next();
            System.out.print(value+" ");
        }

        System.out.println();
        System.out.println("==============");
        //方式3：通过EntrySet 来获取 key-value
        //增强for 或 iterator 均可
        Set entrySet = map.entrySet();
        Iterator iter = entrySet.iterator();
        while (iter.hasNext()) {
            Map.Entry node = (Map.Entry)iter.next();
            System.out.println(node.getKey()+"-"+node.getValue());
        }

    }
}
