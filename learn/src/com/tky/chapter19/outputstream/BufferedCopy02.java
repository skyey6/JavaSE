package com.tky.chapter19.outputstream;

import java.io.*;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/12 16:51
 * 演示使用 BufferedOutputStream 和 BufferedInputStream
 * 使用他们，可以完成二进制文件拷贝.
 * 思考：字节流可以操作二进制文件，可以操作文本文件吗？当然可以
 */
public class BufferedCopy02 {
    public static void main(String[] args) throws IOException {

        String srcPath = "E:\\javase\\test\\spider.png";
        String destPath = "E:\\javase\\test\\a\\spider.png";
        //创建 BufferedOutputStream 对象 BufferedInputStream 对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcPath));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath));

        byte[] buffer = new byte[1024];
        int readLen = 0;

        while ((readLen=bis.read(buffer)) != -1) {
            bos.write(buffer, 0, readLen);
        }

        //关闭流
        bis.close();
        bos.close();

    }
}
