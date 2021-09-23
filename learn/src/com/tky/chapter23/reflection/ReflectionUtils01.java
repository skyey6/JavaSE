package com.tky.chapter23.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/22 13:50
 * 演示如何通过反射获取类的结构信息
 */
public class ReflectionUtils01 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> aClass = Class.forName("com.tky.chapter23.reflection.Person");

        //getName：获取全类名
        System.out.println(aClass.getName());//com.tky.chapter23.reflection.Person

        //getSimpleName：获取简单类名
        System.out.println(aClass.getSimpleName());//Person

        //getFields: 获取所有 public 修饰的属性，包含本类以及父类的(不局限于直接父类)
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println("本类以及父类的属性=" + field.getName());
        }

        //getDeclaredFields: 获取本类中所有属性
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性=" + declaredField.getName());
        }

        //getMethods:获取所有 public 修饰的方法，包含本类以及父类的(不局限于直接父类)
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println("本类以及父类的方法=" + method.getName());
        }

        //getDeclaredMethods:获取本类中所有方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法=" + declaredMethod.getName());
        }

        //getConstructors: 获取本类所有 public 修饰的构造器
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("本类public修饰的构造器=" + constructor.getName());
        }

        //getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类中所有构造器=" + declaredConstructor.getName());
        }

        //getPackage:以 Package 形式返回 包信息
        System.out.println(aClass.getPackage());//package com.tky.chapter23.reflection

        //getSuperClass:以 Class 形式返回父类信息
        Class<?> superclass = aClass.getSuperclass();
        System.out.println("父类的Class对象：" + superclass);

        //getInterfaces:以 Class[]形式返回接口信息
        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口的Class对象：" + anInterface);
        }

        //getAnnotations:以 Annotation[] 形式返回注解信息
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

    }
}