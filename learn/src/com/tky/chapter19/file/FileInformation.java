package com.tky.chapter19.file;

import java.io.File;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/11 15:00
 */
public class FileInformation {
    public static void main(String[] args) {
        info();
    }

    //获取文件的信息
    public static void info() {
        //创建文件对象
        File file = new File("E:\\javase\\test\\news1.txt");

        //调用相应方法，获取信息
        System.out.println("文件名=" + file.getName());
        System.out.println("文件绝对路径=" + file.getAbsolutePath());
        System.out.println("文件父级目录=" + file.getParent());
        System.out.println("文件大小(字节)=" + file.length());
        System.out.println("文件是否存在=" + file.exists());//T
        System.out.println("是不是一个文件=" + file.isFile());//T
        System.out.println("是不是一个目录=" + file.isDirectory());//F
    }
}
