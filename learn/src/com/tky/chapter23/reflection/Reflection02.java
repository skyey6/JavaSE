package com.tky.chapter23.reflection;

import com.tky.chapter23.Cat;

import java.lang.reflect.Method;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/19 21:31
 * 测试反射调用的性能，和优化方案
 */
public class Reflection02 {
    public static void main(String[] args) throws Exception {
        m1();
        m2();
        m3();
    }

    public static void m1() {
        Cat cat = new Cat();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            cat.hi();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("传统方法调用 hi，耗时：" + (endTime - startTime));
    }

    public static void m2() throws Exception {
        Class<?> aClass = Class.forName("com.tky.chapter23.Cat");
        Object instance = aClass.newInstance();
        Method method = aClass.getMethod("hi");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            method.invoke(instance);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("利用反射机制调用 hi，耗时：" + (endTime - startTime));
    }

    //反射调用优化：关闭访问检查
    public static void m3() throws Exception {
        Class<?> aClass = Class.forName("com.tky.chapter23.Cat");
        Object instance = aClass.newInstance();
        Method method = aClass.getMethod("hi");
        method.setAccessible(true); //在反射调用方法时，取消访问检查
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            method.invoke(instance);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("利用反射机制(优化后)调用 hi，耗时：" + (endTime - startTime));
    }
}
