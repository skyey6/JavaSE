package com.tky.chapter19.transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/15 10:16
 * 演示使用 InputStreamReader 转换流解决中文乱码问题
 * 将字节流 FileInputStream 转成字符流 InputStreamReader, 指定编码 gbk/utf-8
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {

        String line;
        String path = "E:\\javase\\test\\problem.txt";
        //1. 把 FileInputStream 转成 InputStreamReader
        //2. 指定编码为 gbk（和要读取的文本文件一致）
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path), "gbk");
        //3. 把 InputStreamReader 传入 BufferedReader
        BufferedReader bufferedReader = new BufferedReader(isr);
        //4. 读取
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        //5. 关闭
        bufferedReader.close();

    }
}
