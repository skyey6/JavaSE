package com.tky.chapter19.transformation;

import java.io.*;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/13 21:51
 */
public class EncodingQuestion {
    public static void main(String[] args) throws IOException {

        //默认情况下，读取文件是按照 utf-8 编码
        //如果读取的文本文件本身编码不是 utf-8，则读取可能出现乱码

        String path = "E:\\javase\\test\\problem.txt";
        String line;

        BufferedReader reader = new BufferedReader(new FileReader(path));

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();

//        InputStreamReader
//        OutputStreamWriter
    }
}
