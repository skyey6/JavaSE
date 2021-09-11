package com.tky.chapter19.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/11 16:32
 * 演示 FileInputStream 的使用(字节输入流 文件--> 程序)
 */
public class FileInputStream_ {
    public static void main(String[] args) {
//        readFile01();
        readFile02();
    }

    /**
     * 演示读取文件...
     * 单个字节的读取，效率比较低
     * -> 使用 read()
     */
    public static void readFile01() {
        String path = "E:\\javase\\test\\hello.txt";
        int data = 0;
        FileInputStream fis = null;
        try {
            //创建 FileInputStream 对象，用于读取文件
            fis = new FileInputStream(path);
            //从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止。
            // 如果返回-1 , 表示读取完毕
            while ((data = fis.read()) != -1) { //如果按字节读取汉字，则会出现乱码（UTF-8中，一个汉字3个字节）
                System.out.print((char)data); //读取结果是int，需要转成字符来显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 使用 read(byte[] b) 读取文件，一次读取 b.length 字节，提高效率
     */
    public static void readFile02() {
        String path = "E:\\javase\\test\\hello.txt";
        int readLen = 0;
        byte[] buffer = new byte[8];
        FileInputStream fis = null;
        try {
            //创建 FileInputStream 对象，用于读取文件
            fis = new FileInputStream(path);
            //从该输入流读取最多 b.length 字节的数据到字节数组。 此方法将阻塞，直到某些输入可用。
            //如果读取正常, 返回实际读取的字节数; 返回-1 , 表示读取完毕
            while ((readLen = fis.read(buffer)) != -1) { //如果按字节读取汉字，则会出现乱码（UTF-8中，一个汉字3个字节）
                System.out.print(new String(buffer,0,readLen)); //byte[] -> String
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
