package com.tky.chapter15.generic;

import java.util.ArrayList;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/5 19:26
 */
public class Generic01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("小黄", 5));

        //假如我们的程序员，不小心，添加了一只猫，会出现异常 ClassCastException
        arrayList.add(new Cat("招财猫",8));

        //遍历
        for (Object o : arrayList) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "-" + dog.getAge());
        }

    }
}

/*
    请编写程序，在 ArrayList 中，添加 3 个 Dog 对象
    Dog 对象含有 name 和 age, 并输出 name 和 age (要求使用 getXxx())
*/
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}