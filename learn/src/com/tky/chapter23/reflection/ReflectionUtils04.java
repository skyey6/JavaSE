package com.tky.chapter23.reflection;

import java.lang.reflect.Constructor;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/22 19:57
 * 演示如何通过反射获取类的结构信息
 */
public class ReflectionUtils04 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> aClass = Class.forName("com.tky.chapter23.reflection.Person");
        //getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类中所有构造器=" + declaredConstructor.getName() +
                    "；该方法的修饰符值=" + declaredConstructor.getModifiers());

            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("\t构造器" + declaredConstructor.getName() +
                        "的形参类型有：" + parameterType);
            }
        }


    }
}
