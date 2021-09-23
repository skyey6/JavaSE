package com.tky.chapter23.reflection;

import java.lang.reflect.Field;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/22 18:57
 * 演示如何通过反射获取类的结构信息
 */
public class ReflectionUtils02 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> aClass = Class.forName("com.tky.chapter23.reflection.Person");
        // getModifiers 获取各个 Field 的修饰符值
        // 说明：默认修饰符 0，public 1，private 2，protected 4，static 8，final 16
        // 例：public static 修饰，则修饰符的值为 1+8=9
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性=" + declaredField.getName() +
                    "；该属性的修饰符值=" + declaredField.getModifiers() +
                    "；该属性的类型=" + declaredField.getType());
        }

    }
}
