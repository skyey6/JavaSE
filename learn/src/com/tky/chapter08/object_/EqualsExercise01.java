package com.tky.chapter08.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person p1 = new Person("小明", 10, '男');
        Person p2 = new Person("小明", 10, '男');
        Person p3 = new Person("大明", 10, '男');

        System.out.println(p1 == p2);   //false
        System.out.println(p1.equals(p2));  //true
        System.out.println(p1.equals(p3));  //false

    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {  //如果比较的是同一对象，直接返回true
            return true;
        } else if (obj instanceof Person) { //传入的对象是Person类才进行比较
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
