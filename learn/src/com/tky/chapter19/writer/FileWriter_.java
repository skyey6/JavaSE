package com.tky.chapter19.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/11 19:50
 */
public class FileWriter_ {
    public static void main(String[] args) {

        String path = "E:\\javase\\test\\note.txt";
        FileWriter writer = null;
        char[] chars = {'h', 'e', 'h', 'e'};
        try {
            writer = new FileWriter(path);
//            writer.write('G'); //写入单个字符
//            writer.write(chars); //写入字符数组
//            writer.write(chars,1,3); //写入字符数组的指定部分
//            writer.write("芜湖起飞"); //写入字符串
            writer.write("芜湖起飞",2,2); //写入字符串的指定部分
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //对于FileWriter，需要close，或者flush，才能真正把数据写入到文件
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
