package com.tky.chapter08.homework;

public class Manager extends Employee {

    private double bonus;   //奖金

    //创建Manager对象时，奖金不确定，因此初始化对象时不设定奖金
    public Manager(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    @Override
    public void printSal() {
        System.out.println("经理" + '\'' + getName() + '\'' + "的工资 = " +
                (bonus + getDaySal() * getWorkDays() * getGrade()));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
