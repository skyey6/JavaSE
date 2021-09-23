package com.tky.chapter23.reflection;

import java.lang.reflect.Field;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/23 16:59
 * 演示反射操作属性
 */
public class ReflectAccessProperty {
    public static void main(String[] args) throws Exception{

        //1. 得到 Student 类对应的 Class 对象
        Class<?> stuClass = Class.forName("com.tky.chapter23.reflection.Student");
        //2. 创建对象
        Object o = stuClass.newInstance();
        System.out.println(o);  //o的运行类型就是 Student
        //3. 使用反射得到 age 的Field对象
        Field age = stuClass.getField("age");
        age.set(o, 88); //通过反射来操作属性
        System.out.println(o);
        System.out.println(age.get(o));
        //4. 使用反射操作 name 属性
        Field name = stuClass.getDeclaredField("name");
        name.setAccessible(true);
//        name.set(o, "tky");
        name.set(null, "tky");  //因为 name 是 static 属性，因此 o 也可以写成 null
        age.set(o, 20);
        System.out.println(o);
        System.out.println(name.get(o));
        System.out.println(name.get(null)); //要求name是静态的，才能填 null

    }
}

class Student {
    public int age;
    private static String name;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", name=" + name + '}';
    }
}