package com.tky.chapter23.reflection;

import java.lang.reflect.Constructor;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/22 20:37
 * 演示通过反射机制创建实例
 */
public class ReflectCreateInstance {
    public static void main(String[] args) throws Exception {

        //1. 获取User类的Class对象
        Class<?> userClass = Class.forName("com.tky.chapter23.reflection.User");

        //2. 通过 public 的无参构造器创建实例
        Object o = userClass.newInstance();
        System.out.println(o);

        //3. 通过 public 的有参构造器创建实例
        /*  此处获取到的构造器为：
            public User(String name) {//public 有参构造器
                this.name = name;
            }
         */
        Constructor<?> constructor1 = userClass.getConstructor(String.class);
        Object o1 = constructor1.newInstance("anonymous");
        System.out.println(o1);

        //4. 通过非 public 的有参构造器创建实例
        Constructor<?> constructor2 = userClass.getDeclaredConstructor(int.class, String.class);
        constructor2.setAccessible(true);   //暴力破解，使用反射可以访问private构造器/方法/属性
        Object o2 = constructor2.newInstance(100, "jack");
        System.out.println(o2);

    }
}

class User { //User 类
    private int age = 20;
    private String name = "tky";

    public User() {//无参 public
    }
    public User(String name) {//public 有参构造器
        this.name = name;
    }
    private User(int age, String name) {//private 有参构造器
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "User [age=" + age + ", name=" + name + "]";
    }
}