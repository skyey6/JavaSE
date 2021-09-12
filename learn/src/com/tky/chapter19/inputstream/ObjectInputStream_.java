package com.tky.chapter19.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/12 19:36
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException {

        //指定反序列化的文件
        String path = "E:\\javase\\test\\data.abc";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));

        //读取
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());

        Object dog = null;
        try {
            dog = ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("运行类型："+dog.getClass());
        System.out.println(dog);

        //关闭流
        ois.close();
    }
}
