package com.tky.chapter19.file;

import java.io.File;
import java.io.IOException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/11 14:31
 * 演示创建文件
 */
public class FileCreate {
    public static void main(String[] args) {
//        createFile01();
//        createFile02();
        createFile03();
    }

    //方式1 new File(String pathname)
    public static void createFile01() {
        String path = "E:\\javase\\test\\news1.txt";
        //这里的 file 对象，在 java 程序中，只是一个对象
        //只有执行了 createNewFile 方法，才会真正的，在磁盘创建该文件
        File file = new File(path);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式 2 new File(File parent,String child) //根据父目录文件对象+子路径构建
    public static void createFile02() {
        File parentFile = new File("E:\\javase\\test\\");
        String filename = "news2.txt";
        File file = new File(parentFile, filename);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式 3 new File(String parent,String child) //根据父目录+子路径构建
    public static void createFile03() {
        String parentPath = "E:\\javase\\test\\";
        String filename = "news3.txt";
        File file = new File(parentPath, filename);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
