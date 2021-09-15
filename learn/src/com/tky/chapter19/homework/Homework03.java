package com.tky.chapter19.homework;

import java.io.*;
import java.util.Properties;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/15 18:50
 */
public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Properties prop = new Properties();
        prop.load(new FileReader("learn/src/com/tky/chapter19/homework/dog.properties"));
//        prop.list(System.out);
        String name = prop.getProperty("name");
        int age = Integer.parseInt(prop.getProperty("age"));
        String color = prop.getProperty("color");

        Dog dog = new Dog(name, age, color);
        System.out.println(dog);

        //序列化
        String path = "E:\\javase\\test\\dog.abc";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(dog);
        oos.close();
        System.out.println("dog对象序列化完成~");

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Dog aDog = (Dog)ois.readObject();
        ois.close();
        System.out.println(aDog);


    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
