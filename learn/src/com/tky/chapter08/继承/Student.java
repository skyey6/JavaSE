package com.tky.chapter08.继承;

public class Student {
    public String name;
    public int age;
    private double score;

    public Student() {
        System.out.println("调用了Student构造器");
    }

    public Student(String name, int age, double score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学生名='" + name + '\'' +
                ", 年龄=" + age +
                ", 成绩=" + score +
                '}';
    }
}
