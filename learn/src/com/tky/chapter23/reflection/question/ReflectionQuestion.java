package com.tky.chapter23.reflection.question;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/19 17:37
 * 引入反射
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //根据配置文件 re.properties 指定信息, 创建Cat对象并调用方法hi
        //老韩回忆

        //传统的方式 new 对象 -》 调用方法
//        Cat cat = new Cat();
//        cat.hi(); ==> cat.cry() 修改源码.

        //我们尝试做一做 -> 明白反射

        //1. 使用Properties 类, 可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("learn/src/com/tky/chapter23/re.properties"));
        String classfullpath = properties.getProperty("classfullpath");//"com.tky.chapter23.Cat"
        String methodName = properties.getProperty("method");//"hi"
        System.out.println("classfullpath=" + classfullpath);
        System.out.println("method=" + methodName);

        //2. 创建对象，传统的方法，行不通 ==》 使用反射机制
        //new classfullpath();

        //使用反射机制解决
        //(1) 加载类, 返回Class类型的对象cls
        Class cls = Class.forName(classfullpath);
        //(2) 通过 cls 得到加载的类 com.tky.chapter23.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型=" + o.getClass()); //运行类型 class com.tky.chapter23.Cat
        //(3) 通过 cls 得到你加载的类 com.tky.chapter23.Cat 的 methodName"hi"  的方法对象
        //    即：在反射中，可以把方法视为对象（万物皆对象）
        Method method1 = cls.getMethod(methodName);
        //(4) 通过method1 调用方法: 即通过方法对象来实现调用方法
        System.out.println("=============================");
        method1.invoke(o); //传统方法：对象.方法() , 反射机制：方法.invoke(对象)

    }
}
