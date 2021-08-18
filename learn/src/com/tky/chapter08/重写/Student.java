package com.tky.chapter08.重写;

public class Student extends Person{
    private int id;
    private double score;

    public Student(String name, int age, int id, double score){
        super(name, age);
        setId(id);
        setScore(score);
    }

    @Override
    public String say() {   //体现了super的好处，实现了代码复用
        return super.say() + " id=" + id + " 分数=" + score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
