package com.tky.chapter23.reflection;

import java.lang.reflect.Method;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/22 19:20
 * 演示如何通过反射获取类的结构信息
 */
public class ReflectionUtils03 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> aClass = Class.forName("com.tky.chapter23.reflection.Person");
        // 说明：默认修饰符 0，public 1，private 2，protected 4，static 8，final 16
        // 例：public static 修饰，则修饰符的值为 1+8=9
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法=" + declaredMethod.getName() +
                    "；该方法的修饰符值=" + declaredMethod.getModifiers() +
                    "；该方法的返回类型=" + declaredMethod.getReturnType());
            //输出当前方法的形参类型数组
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("\t方法" + declaredMethod.getName() + "的形参类型有：" + parameterType);
            }
        }

    }
}
