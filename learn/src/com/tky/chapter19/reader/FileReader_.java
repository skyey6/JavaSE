package com.tky.chapter19.reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/11 19:37
 */
public class FileReader_ {
    public static void main(String[] args) {

        String path = "E:\\javase\\test\\readme.txt";
        FileReader reader = null;
        int data = 0;
        int readLen = 0;
        char[] chs = new char[8];
        try {
            reader = new FileReader(path);
            //读取文件
//            while ((data = reader.read()) != -1) { //单个字符地读取
//                System.out.print((char) data);
//            }
            while ((readLen = reader.read(chs)) != -1) { //一次读取多个字符
                System.out.print(new String(chs,0,readLen));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
