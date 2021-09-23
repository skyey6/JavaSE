package com.tky.chapter23.reflection;

import java.lang.reflect.Method;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/23 18:47
 * 演示通过反射调用方法
 */
public class ReflectAccessMethod {
    public static void main(String[] args) throws Exception {

        //1. 得到 Boss 类对应的 Class 对象
        Class<?> bossClass = Class.forName("com.tky.chapter23.reflection.Boss");
        //2. 创建对象
        Object o = bossClass.newInstance();
        //3. 调用 public 的 hi 方法
        Method hi = bossClass.getMethod("hi", String.class);
        hi.invoke(o, "tky");
        //4. 调用 private static 方法
        Method say = bossClass.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);
//        Object s = say.invoke(o, 1, "xiaoming", 'm');
        Object s = say.invoke(null, 1, "xiaoming", 'm'); //静态方法，可以填 null
        System.out.println(s);

        //5. 在反射中，如果方法有返回值，统一返回 Object， 但是运行类型和方法定义的返回类型一致
        Object retVal = say.invoke(null, 12, "李四", 'f');
        System.out.println("retVal的运行类型=" + retVal.getClass());

    }
}

class SomeThing {}
class Boss {//类
    public int age;
    private static String name;

    public Boss() {//构造器
    }

    public SomeThing m1() {
        return new SomeThing();
    }

    private static String say(int n, String s, char c) {//静态方法
        return n + " " + s + " " + c;
    }

    public void hi(String s) {//普通 public 方法
        System.out.println("hi " + s);
    }
}