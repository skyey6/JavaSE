package com.tky.chapter08.多态.polyparam;

public class Worker extends Employee {

    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("普通员工" + getName() + "正在工作...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
