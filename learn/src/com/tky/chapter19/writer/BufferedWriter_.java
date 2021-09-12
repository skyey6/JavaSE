package com.tky.chapter19.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/12 16:19
 * 演示 BufferedWriter 的使用
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {

        String path = "E:\\javase\\test\\b_writer.txt";

        //创建 BufferedWriter
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));

        //写文件
        bufferedWriter.write("hello,tky 一");
        bufferedWriter.newLine();   //插入一个当前系统的换行符
        bufferedWriter.write("hello,tky 二");
        bufferedWriter.newLine();
        bufferedWriter.write("hello,tky 三");
        bufferedWriter.newLine();

        //关闭流
        bufferedWriter.close();
    }
}
