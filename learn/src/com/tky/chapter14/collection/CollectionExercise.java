package com.tky.chapter14.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/26 15:46
 */
public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Dog("小黑",3));
        list.add(new Dog("大黄",100));
        list.add(new Dog("小黄",8));

        for (Object dog : list) {
            System.out.println(dog);
        }

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object dog = it.next();
            System.out.println(dog);
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
