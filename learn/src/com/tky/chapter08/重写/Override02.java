package com.tky.chapter08.重写;

public class Override02 {
    public static void main(String[] args) {
        Person person = new Person("小明", 5);
        Student student = new Student("小黑", 18, 20200105, 80);

        System.out.println(person.say());
        System.out.println(student.say());
    }
}
