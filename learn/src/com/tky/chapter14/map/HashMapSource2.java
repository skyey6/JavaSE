package com.tky.chapter14.map;

import java.util.HashMap;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/1 22:01
 */
public class HashMapSource2 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 12; i++) {
            hashMap.put(new A(i), "hello");
        }
        hashMap.put("aaa", "bbb");
        System.out.println("hashMap=" + hashMap);
    }
}

class A {
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}