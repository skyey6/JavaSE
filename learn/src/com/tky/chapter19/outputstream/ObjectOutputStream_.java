package com.tky.chapter19.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/12 19:15
 * 演示 ObjectOutputStream 的使用, 完成数据的序列化
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {

        //序列化后，保存的文件格式，不是纯文本，而是按照他的格式来保存
        String path = "E:\\javase\\test\\data.abc";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));

        //序列化数据，保存到路径path下
        oos.writeInt(100); // int -> Integer (实现了 Serializable)
        oos.writeBoolean(true);// boolean -> Boolean (实现了 Serializable)
        oos.writeChar('a');// char -> Character (实现了 Serializable)
        oos.writeDouble(9.5);// double -> Double (实现了 Serializable)
        oos.writeUTF("芜湖~~");// String (实现了 Serializable)

        Dog dog = new Dog("旺财", 10);
        oos.writeObject(dog);

        //关闭流
        oos.close();
        System.out.println("数据保存完毕 (序列化成功)");


    }
}
//如果需要序列化某个类的对象，这个类需要实现 Serializable 接口
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
