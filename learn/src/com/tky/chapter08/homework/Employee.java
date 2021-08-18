package com.tky.chapter08.homework;

public class Employee {
    /*   属性   */
    private String name;
    private double daySal;  //单日工资
    private int workDays;   //工作天数
    private double grade;   //等级

    /*   方法   */
    public Employee(String name, double daySal, int workDays, double grade) {
        this.name = name;
        this.daySal = daySal;
        this.workDays = workDays;
        this.grade = grade;
    }

    //打印工资的方法
    public void printSal() {
        System.out.println('\'' + name + '\'' + "的工资 = " + daySal * workDays * grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
