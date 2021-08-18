package com.tky.chapter08.homework;

public class Homework03 {
    public static void main(String[] args) {
        Professor ming = new Professor("小明", 30, "高级职称", 30000, 1.3);
        ming.introduce();
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;   //工资级别

    public Teacher(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public void introduce() {
        System.out.println("name:" + name + " age:" + age + " post:" + post +
                " salary:" + salary + " grade:" + grade);
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是教授的信息:");
        super.introduce();
    }
}