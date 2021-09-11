package com.tky.chapter19.outputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/11 19:00
 * 文件拷贝
 */
public class FileCopy {
    public static void main(String[] args) {

        //完成 文件拷贝，将 E:\javase\spider.png 拷贝到 E:\javase\test 目录下
        String fromPath = "E:\\javase\\spider.png";
        String toPath = "E:\\javase\\test\\spider.png";

        if (new File(toPath).exists()) {
            System.out.println("文件已存在，不需要复制");
            return;
        }

        FileInputStream fis = null;
        int readLen = 0;
        byte[] buffer = new byte[1024];
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(fromPath);
            fos = new FileOutputStream(toPath);
            while ((readLen=fis.read(buffer)) != -1) {
                //读到文件后，开始写文件
                //边读边写
                fos.write(buffer,0,readLen);
            }
            System.out.println("拷贝结束~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
