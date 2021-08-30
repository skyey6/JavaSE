package com.tky.chapter14.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/30 20:21
 */
public class MapSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","嘻嘻");
        map.put("no2","哈哈");

        //1. k-v 是存在 HashMap$Node 中的
        //2. 为了方便遍历，还会创建 EntrySet 集合，这种集合中存放的元素类型：Map.Entry
        //      transient Set<Map.Entry<K,V>> entrySet;
        //3. entrySet 中，定义的类型是 Map.Entry，但实际上存放的还是 HashMap$Node
        //      static class Node<K,V> implements Map.Entry<K,V>
        //4. 当把 HashMap$Node 对象 存放到 entrySet后，就方便遍历了

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        //HashMap$Node 实现了 Map.Entry 接口
        //HashMap$EntrySet的实例 中存放 Map.Entry的实例

    }
}
