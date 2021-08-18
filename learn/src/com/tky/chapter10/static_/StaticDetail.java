package com.tky.chapter10.static_;

public class StaticDetail {
    public static void main(String[] args) {
        System.out.println(Child.age);
        Child.age=10;
        System.out.println(Child.age);
        Child.play();
    }
}

class Child {
    public String name;
    public static int age = 5;

    public String getName() {
        return this.name;
    }

    public static void play() {
        System.out.println("Child loves to play games...");
//        System.out.println(name); //静态方法中只能访问静态变量、静态方法
//        System.out.println(this.name);    //静态方法中不能使用this、super
    }
}
