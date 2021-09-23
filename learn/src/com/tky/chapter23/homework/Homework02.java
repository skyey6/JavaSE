package com.tky.chapter23.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/23 19:19
 */
public class Homework02 {
    public static void main(String[] args) throws Exception{

        Class<?> fileClass = Class.forName("java.io.File");
        for (Constructor<?> constructor : fileClass.getDeclaredConstructors()) {
            System.out.println(constructor);
        }

        Constructor<?> constructor = fileClass.getConstructor(String.class);
        Object file = constructor.newInstance("E:\\javase\\test\\reflect.txt");
        System.out.println("file的运行类型：" + file.getClass());

        Method createNewFile = fileClass.getMethod("createNewFile");
        createNewFile.invoke(file);

    }
}
