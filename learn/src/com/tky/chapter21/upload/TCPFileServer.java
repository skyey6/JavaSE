package com.tky.chapter21.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/18 17:36
 */
public class TCPFileServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在8888端口监听...");
        Socket socket = serverSocket.accept();

        //接收客户端发送的文件
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        FileOutputStream fos = new FileOutputStream(new File("learn/src/com/tky/chapter21/upload/spider.png"));
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen=bis.read(buf)) != -1) { //边读边写
            bos.write(buf, 0, readLen);
        }

        //给客户端发送“收到图片”
        bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write("收到图片".getBytes());
        bos.flush();
        socket.shutdownOutput();

        //释放资源
        bos.close();
        bis.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端关闭...");
    }
}
