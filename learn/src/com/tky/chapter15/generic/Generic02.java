package com.tky.chapter15.generic;

import java.util.ArrayList;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/5 19:38
 */
public class Generic02 {
    public static void main(String[] args) {

        //使用泛型
        //1. 当我们 ArrayList<Dog> 表示存放到 ArrayList 集合中的元素是 Dog 类型 (细节后面说...)
        //2. 如果编译器发现添加的类型，不满足要求，就会报错
        //3. 在遍历的时候，可以直接取出 Dog 类型而不是 Object
        //4. public class ArrayList<E> {} E 称为泛型,那么 Dog->E
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("小黄", 5));

        //假如我们的程序员，不小心，添加了一只猫，编译器直接报错
//        arrayList.add(new Cat("招财猫",8));

        //遍历
        for (Dog dog : arrayList) {
            System.out.println(dog.getName() + "-" + dog.getAge());
        }

    }
}
/*
    请编写程序，在 ArrayList 中，添加 3 个 Dog 对象
    Dog 对象含有 name 和 age, 并输出 name 和 age (要求使用 getXxx())
*/

