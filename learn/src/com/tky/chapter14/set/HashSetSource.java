package com.tky.chapter14.set;

import java.util.HashSet;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/28 13:48
 */
public class HashSetSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        hashSet.add("java"); //到此位置，第 1 次 add 分析完毕.
        hashSet.add("php"); //到此位置，第 2 次 add 分析完毕
        hashSet.add("java"); //
        System.out.println("set = " + hashSet);

        /* 源码：
            1. 执行add
            public boolean add(E e) {
                return map.put(e, PRESENT)==null;
            }
            关于PRESENT：
            // Dummy value to associate with an Object in the backing Map
            private static final Object PRESENT = new Object();

            2.执行put
            public V put(K key, V value) {
                return putVal(hash(key), key, value, false, true);
            }

            3.执行hash，得到key对应的hash值（不是hashCode）
            static final int hash(Object key) {
                int h;
                return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
            }

            4.执行putVal
         */
    }
}
