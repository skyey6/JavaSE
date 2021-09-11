package com.tky.chapter19.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/11 18:40
 */
public class FileOutputStream01 {
    public static void main(String[] args) {
        write();
    }

    /**
     * 演示使用 FileOutputStream 将数据写入文件，
     * 如果该文件不存在，则会创建该文件
     */
    public static void write() {

        String path = "E:\\javase\\test\\a.txt";
        FileOutputStream fos = null;

        try {
            //new FileOutputStream 对象
            //1. new FileOutputStream(filePath) 创建方式，当写入内容时，会覆盖原来的内容
            //2. new FileOutputStream(filePath, true) 创建方式，当写入内容时，是追加到文件后面
            fos = new FileOutputStream(path);

            //写入一个字节
//            fos.write('a');

            //写入字符串
            String str = "hello,world!";

//            fos.write(str.getBytes());  //getBytes() 可以将字符串转成字节数组
            fos.write(str.getBytes(), 6, 5);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
