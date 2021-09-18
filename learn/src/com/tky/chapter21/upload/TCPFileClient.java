package com.tky.chapter21.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/18 17:36
 */
public class TCPFileClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        //获取文件，给服务器发送文件
        FileInputStream fis = new FileInputStream(new File("E:\\javase\\spider.png"));
        BufferedInputStream bis = new BufferedInputStream(fis); //读文件
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());  //发给服务端
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen=bis.read(buf)) != -1) { //边读边写
            bos.write(buf, 0, readLen);
        }
        bos.flush();
        socket.shutdownOutput(); //输出结束标志

        //接收服务端发送的“收到图片”
        bis = new BufferedInputStream(socket.getInputStream());
        while ((readLen=bis.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        //释放资源
        bos.close();
        bis.close();
        socket.close();
        System.out.println("客户端关闭...");
    }
}
