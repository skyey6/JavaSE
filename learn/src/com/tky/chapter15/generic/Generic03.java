package com.tky.chapter15.generic;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/5 20:07
 */
public class Generic03 {
    public static void main(String[] args) {

        //E 具体是哪种数据类型，在定义 Person 对象的时候指定。
        // 即在编译期间，就确定了 E 是什么类型
        Person<String> p = new Person<String>("一段字符串");
//        Person<String> p = new Person<String>(100); //编译错误
        /*
            传入 String 后：
            class Person<String> {
                String s;

                public Person(String s) { //E可以是参数类型
                    this.s = s;
                }

                public String getS() { //E可以是返回值的类型
                    return s;
                }
            }
         */

    }
}
/*
    泛型的作用是：
        可以在类声明时通过一个标识表示类中某个属性的类型，
        或者是某个方法的返回值的类型，或者是参数类型。
 */
class Person<E> {
    E s;

    public Person(E s) { //E可以是参数类型
        this.s = s;
    }

    public E getS() { //E可以是返回值的类型
        return s;
    }
}
