package com.tky.chapter15.generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/5 20:29
 */
public class GenericExercise {
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();
        set.add(new Student("jack", 18));
        set.add(new Student("tom", 28));
        set.add(new Student("mary", 19));
        //遍历set
        for (Student student : set) {
            System.out.println(student);
        }

        System.out.println("=================================");

        HashMap<String, Student> map = new HashMap<>();
        map.put("jack", new Student("jack", 18));
        map.put("tom", new Student("tom", 28));
        map.put("mary", new Student("mary", 19));
        //遍历map
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + "-" + map.get(key));
        }


    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
