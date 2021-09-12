package com.tky.chapter19.writer;

import java.io.*;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/12 16:26
 */
public class BufferedCopy {
    public static void main(String[] args) {

        // 1. BufferedReader 和 BufferedWriter 是按照字符操作的
        // 2. 不要去操作 二进制文件[声音，视频，doc, pdf ], 否则可能造成文件的损坏

        String srcPath = "E:\\javase\\test\\readme.txt";
        String destPath = "E:\\javase\\test\\a\\readme.txt";
        BufferedReader br = null;
        String line;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(srcPath));
            bw = new BufferedWriter(new FileWriter(destPath));

            while ((line=br.readLine()) != null) {
                //每读取一行，就写入一行
                bw.write(line);
                bw.newLine();   //插入换行符
            }
            System.out.println("拷贝结束");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
