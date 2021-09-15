package com.tky.chapter19.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/15 17:09
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {

        String path = "E:\\javase\\test\\mytemp";
        File file = new File(path);
        if (file.exists()) {
            System.out.println(file.getCanonicalPath() + "已经存在，不再创建");
        } else {
            if (file.mkdir()) {
                System.out.println("创建成功~");
            } else {
                System.out.println("创建失败...");
            }
        }

        File file1 = new File(path + "\\hello.txt");
        if (file1.exists()) {
            System.out.println(file1.getCanonicalPath() + "已经存在，不再创建");
        } else {
            if (file1.createNewFile()) {
                System.out.println("创建成功~");
                FileWriter fileWriter = new FileWriter(file1);
                fileWriter.write("hello,world!\n");
                fileWriter.close();
            } else {
                System.out.println("创建失败...");
            }
        }

    }
}
