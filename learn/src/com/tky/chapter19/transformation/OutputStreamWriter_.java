package com.tky.chapter19.transformation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/15 10:35
 * 演示使用 OutputStreamWriter
 * 将字节流 FileOutputStream 转成字符流 OutputStreamWriter, 指定编码 gbk/utf-8
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String path = "E:\\javase\\test\\encoding.txt";
        String charset = "gbk";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path), charset);
        osw.write("hi, 阿萨德发光");
        osw.close();
        System.out.println("按照" + charset + "编码保存成功~");
    }
}
