package com.tky.chapter19.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/12 16:10
 * 演示 BufferedReader 的使用
 */
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {

        String path = "E:\\javase\\test\\readme.txt";
        String line;

        //BufferedReader 包装了 FileReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        //读取
        //readLine() 整行读取，返回 null 表示读取完毕
        while ((line=bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        //关闭流，只需关闭包装流即可，底层会自动关闭节点流
        bufferedReader.close();

    }
}
