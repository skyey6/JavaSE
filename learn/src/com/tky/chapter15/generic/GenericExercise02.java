package com.tky.chapter15.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/6 9:49
 */
public class GenericExercise02 {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("tom", 20000, new MyDate(1980, 12, 11)));
        list.add(new Employee("jack", 12000, new MyDate(2001, 12, 12)));
        list.add(new Employee("jack", 12000, new MyDate(2000, 12, 12)));
        list.add(new Employee("tom", 50000, new MyDate(1980, 12, 10)));
        list.add(new Employee("hsp", 50000, new MyDate(1980, 12, 10)));

        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().equals(o2.getName())) {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee e : list) {
            System.out.println(e);
        }

    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}

class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public int compareTo(MyDate date) {
        if (getYear() != date.getYear())
            return getYear() - date.getYear();
        if (getMonth() != date.getMonth())
            return getMonth() - date.getMonth();
        if (getDay() != date.getDay())
            return getDay() - date.getDay();
        return 0;
    }

    @Override
    public String toString() {
        return  year + "-" + month + "-" + day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
