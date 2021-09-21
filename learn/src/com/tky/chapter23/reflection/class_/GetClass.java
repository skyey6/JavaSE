package com.tky.chapter23.reflection.class_;

import com.tky.chapter23.Car;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/21 16:04
 * 演示得到 Class 对象的各种方式 6
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class.forName()
        String classFullPath = "com.tky.chapter23.Car";
        Class<?> aClass = Class.forName(classFullPath);
        System.out.println(aClass); //class com.tky.chapter23.Car

        //2. 类名.class
        Class<Car> aClass1 = Car.class;
        System.out.println(aClass1);//class com.tky.chapter23.Car

        //3. 对象.getClass()
        Car car = new Car();
        Class<? extends Car> aClass2 = car.getClass();
        System.out.println(aClass2);//class com.tky.chapter23.Car

        //4. 通过类加载器来获取到类的 Class 对象【4种】
        //(1)先得到类加载器
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)通过类加载器得到Class对象
        Class<?> aClass3 = classLoader.loadClass(classFullPath);
        System.out.println(aClass3);

        //5. 基本数据(int, char,boolean,float,double,byte,long,short) 按如下方式得到 Class 类对象
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);   //int

        //6. 基本数据类型对应的包装类，可以通过 .TYPE 得到 Class 类对象
        Class<Integer> type = Integer.TYPE;
        Class<Character> type1 = Character.TYPE;
        System.out.println(type);
        System.out.println(type1);

        System.out.println(integerClass.hashCode());
        System.out.println(type.hashCode());

    }
}
