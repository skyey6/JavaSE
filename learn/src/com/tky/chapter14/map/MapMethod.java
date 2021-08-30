package com.tky.chapter14.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/30 20:49
 */
public class MapMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("邓超", new Book3());//OK
        map.put("邓超", "孙俪");//替换-> 一会分析源码
        map.put("王宝强", "马蓉");//OK
        map.put("宋喆", "马蓉");//OK
        map.put("刘令博", null);//OK
        map.put(null, "刘亦菲");//OK
        map.put("鹿晗", "关晓彤");//OK

        System.out.println("map=" + map);

        Set keySet = map.keySet();
        System.out.println(keySet);

        //remove: 根据key来删除k-v
        map.remove("宋喆");
        System.out.println("map=" + map);

        //get: 根据key获得value
        System.out.println(map.get("邓超"));

        //size: 获取k-v对的个数
        System.out.println(map.size());

        //isEmpty: 判断k-v对的个数是否为0
        System.out.println(map.isEmpty());

        //containsKey: 查询key是否存在
        System.out.println(map.containsKey("tky")); //false

        //clear: 清空
        map.clear();
        System.out.println("map=" + map);

        System.out.println(keySet);
    }
}

class Book3 {

}
