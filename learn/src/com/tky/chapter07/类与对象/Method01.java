package com.tky.chapter07.类与对象;

public class Method01 {
    public static void main(String[] args) {
        Person p1 = new Person("p1", 20);
        p1.speak("我是一个好人");
    }
}

class Person{
    //属性
    String name;
    int age;

    //方法
    public Person(){
        name = "小明";
        age = 3;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(String words){
        System.out.println(name + ": " + words);
    }
}