package com.tky.chapter23.reflection.class_;

import java.io.Serializable;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/21 16:44
 * 演示哪些类型有 Class 对象
 */
public class AllTypeClass {
    public static void main(String[] args) {

        Class<String> cls1 = String.class;  //外部类
        Class<Serializable> cls2 = Serializable.class;  //接口
        Class<Integer[]> cls3 = Integer[].class;    //数组
        Class<int[][]> cls4 = int[][].class;    //二维数组
        Class<Thread.State> cls5 = Thread.State.class;  //枚举
        Class<Deprecated> cls6 = Deprecated.class;  //注解
        Class<Float> cls7 = float.class;    //基本数据类型
        Class<Void> cls8 = void.class;  //void

        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
        System.out.println(cls4);
        System.out.println(cls5);
        System.out.println(cls6);
        System.out.println(cls7);
        System.out.println(cls8);

    }
}
