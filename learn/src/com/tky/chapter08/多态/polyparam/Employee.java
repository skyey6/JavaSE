package com.tky.chapter08.多态.polyparam;

public class Employee {
    private String name;
    private double salary;  //月工资

    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    /**
     * 计算年工资
     * @return 当前员工的年工资
     */
    public double getAnnual(){
        return salary * 12;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
