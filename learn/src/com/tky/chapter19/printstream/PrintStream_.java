package com.tky.chapter19.printstream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/15 11:32
 * 演示 PrintStream （字节打印流/输出流）
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {

        //在默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
        /*
            public void print(String s) {
                if (s == null) {
                    s = "null";
                }
                write(s);
            }
         */
        PrintStream out = System.out;
        out.println("hello,呵呵");
        out.write("也可以直接使用write方法打印".getBytes());
        out.close();


        //可以修改打印流输出的位置/设备
        //1. 输出修改成到 "E:\javase\test\print_stream.txt"
        //2. "123 test 打印流" 就会输出到 E:\javase\test\print_stream.txt
        /*
            public static void setOut(PrintStream out) {
                checkIO();
                setOut0(out);
            }
         */
        System.setOut(new PrintStream("E:\\javase\\test\\print_stream.txt"));
        System.out.println("123 test 打印流");

    }
}
