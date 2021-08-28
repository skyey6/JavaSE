package com.tky.chapter14.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/28 19:08
 */
public class HashSetExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("xiaoming", 25)); //ok
        hashSet.add(new Employee("tom", 25)); //ok
        hashSet.add(new Employee("tom", 28)); //ok
        hashSet.add(new Employee("xiaoming", 25)); //加入失败
        System.out.println("hashSet = " + hashSet);


    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    //name和age的值相同时，认为是同一个员工
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    //name和age的值相同时，返回相同的hash值
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
