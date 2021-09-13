package com.tky.chapter19.transformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/13 21:51
 */
public class EncodingQuestion {
    public static void main(String[] args) throws IOException {

        //默认情况下，读取文件是按照 utf-8 编码

        String path = "E:\\javase\\test\\readme.txt";
        String line;

        BufferedReader reader = new BufferedReader(new FileReader(path));

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();

    }
}
