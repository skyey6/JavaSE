package com.tky.chapter14.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/31 20:33
 */
public class MapExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(1, new Employee("jack", 300000, 1));
        map.put(2, new Employee("tom", 21000, 2));
        map.put(3, new Employee("milan", 12000, 3));

        //遍历方式1
        for (Object key : map.keySet()) {
             Employee emp = (Employee) map.get(key);
            if (emp.getSalary() > 18000) {
                System.out.println("key=" + key + " value=" + map.get(key));
            }
        }

        //遍历方式2
        Set entrySet = map.entrySet();
        for (Object o : entrySet) {
            Map.Entry entry = (Map.Entry) o;
            Employee emp = (Employee) entry.getValue();
            if (emp.getSalary() > 18000) {
                System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
            }
        }

    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(String name, double salary, int id) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
