package com.tky.chapter08.homework;

public class Homework01 {
    public static void main(String[] args) {
        //Person对象数组
        Person[] persons = new Person[3];
        persons[0] = new Person("jack", 10, "小学生");
        persons[1] = new Person("tom", 50, "大数据工程师");
        persons[2] = new Person("mary", 30, "PHP工程师");

        //输出当前对象数组
        for (Person person : persons) {
            System.out.println(person);
        }

        //根据年龄从大到小进行排序（冒泡）
        Person p;
        boolean flag;
        for (int i = 0; i < persons.length - 1; i++) {
            flag = false;
            for (int j = 0; j < persons.length - i - 1; j++) {
                if (persons[j].getAge() < persons[j+1].getAge()){
                    p = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = p;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }

        //再次输出
        System.out.println("================排序后================");
        for (Person person : persons) {
            System.out.println(person);
        }

    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
