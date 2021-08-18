package com.tky.chapter08.多态.polyparam;

public class Manager extends Employee{
    private double bonus;   //奖金

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理" + getName() + "正在进行管理...");
    }

    @Override
    public double getAnnual(){
        return super.getAnnual() + bonus;
    }
}
