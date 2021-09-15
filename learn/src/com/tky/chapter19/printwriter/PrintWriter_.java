package com.tky.chapter19.printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/15 11:48
 * 演示 PrintWriter 使用方式
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("hi~,123");
        printWriter.close();

        String path = "E:\\javase\\test\\print_writer.txt";
        PrintWriter printWriter2 = new PrintWriter(new FileWriter(path));
        printWriter2.println("hi~,123");
        printWriter2.close();

    }
}
