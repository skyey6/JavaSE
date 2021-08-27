package com.tky.chapter14.list;

import java.util.Vector;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/27 16:30
 */
public class Vector_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //无参构造器，调用有参构造器，参数为10
        /* 源码：
            public Vector() {
                this(10);
            }
        */
        Vector vector = new Vector(10,2);
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }


    }
}
