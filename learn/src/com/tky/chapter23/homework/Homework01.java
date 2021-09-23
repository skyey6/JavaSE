package com.tky.chapter23.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/23 19:13
 */
public class Homework01 {
    public static void main(String[] args) throws Exception {

        Class<?> privateClass = Class.forName("com.tky.chapter23.homework.PrivateTest");
        Object o = privateClass.newInstance();
        Field name = privateClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o, "tky");

        Method getName = privateClass.getMethod("getName");
        System.out.println("name属性的值为：" + getName.invoke(o));

    }
}

class PrivateTest {
    private String name = "yyj";

    public String getName() {
        return name;
    }
}