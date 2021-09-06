package com.tky.chapter15.generic;

import java.util.ArrayList;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/6 8:46
 */
public class GenericDetail {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        ArrayList<int> arrayList2 = new ArrayList<int>(); //错误


        /*
            在给泛型指定具体类型后，可以传入该类型，或者该类型的子类类型
         */
        ArrayList<Parent> list = new ArrayList<>();
        list.add(new Parent());
        list.add(new Parent());
        list.add(new Child());
        list.add(new Child());
        System.out.println(list);

        Pig<Parent> pig1 = new Pig<>("黑猪", new Parent());
        Pig<Parent> pig2 = new Pig<>("小黑猪", new Child());
        pig1.f();
        pig2.f();

        //如果这样写，泛型默认是 Object
        Pig pig = new Pig("wilbur", new Object());



    }
}

class Parent {}
class Child extends Parent {}

class Pig<T> {
    String name;
    T attr;

    public Pig() {}

    public Pig(String name, T attr) {
        this.name = name;
        this.attr = attr;
    }

    public void f() {
        System.out.println(attr.getClass());
    }
}