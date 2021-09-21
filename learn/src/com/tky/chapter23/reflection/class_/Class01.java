package com.tky.chapter23.reflection.class_;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/20 10:50
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class 也是类，因此也继承 Object 类
//        Class

        //2. Class 类对象不是 new 出来的，而是系统创建的
        //(1) 传统new对象
        /*  ClassLoader 类
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return loadClass(name, false);
            }
         */
//        Cat cat = new Cat();
        //(2) 反射方式
        /*  ClassLoader 类, 仍然是通过 ClassLoader 类加载 Cat 类的 Class 对象
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return loadClass(name, false);
            }
         */
        Class<?> aClass1 = Class.forName("com.tky.chapter23.Cat");

        //3. 对于某个类的 Class 类对象，在内存中只有一份，因为类只加载一次
        Class<?> aClass2 = Class.forName("com.tky.chapter23.Cat");
        System.out.println(aClass1.hashCode()); //1554874502
        System.out.println(aClass2.hashCode()); //1554874502

    }
}
