package com.tky.chapter08.重写;

public class Person {
    private String  name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String say(){
        return "姓名=" + name + " 年龄=" + age;
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
