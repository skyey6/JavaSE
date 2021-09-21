package com.tky.chapter23.reflection.class_;

import com.tky.chapter23.Car;

import java.lang.reflect.Field;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/20 15:24
 * 演示 Class 类的常用方法
 */
public class Class02 {
    public static void main(String[] args) throws Exception{

        String classFullPath = "com.tky.chapter23.Car";
        //1 . 获取到 Car 类 对应的 Class 对象
        // <?> 表示不确定的 Java 类型
        Class<?> cls = Class.forName(classFullPath);
        //2. 输出 cls
        System.out.println(cls); //显示 cls 是哪个类的 Class 对象：com.tky.chapter23.Car
        System.out.println(cls.getClass()); //输出 cls 运行类型：java.lang.Class
        //3. 得到包名
        System.out.println(cls.getPackage().getName()); //包名
        //4. 得到全类名
        System.out.println(cls.getName());
        //5. 通过 cls 创建对象实例
        Car car = (Car)cls.newInstance();
        System.out.println(car);
        //6. 通过反射获得属性
        Field brand = cls.getField("brand"); //不能获取私有属性
        System.out.println(brand.get(car)); //bmw
        //7. 通过反射给属性赋值
        brand.set(car, "benz");
        System.out.println(brand.get(car)); //benz
        //8. 得到所有的属性(字段)
        System.out.println("========================");
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.print(field.getName() + "  "); //car对象各字段的名称
        }


    }
}
