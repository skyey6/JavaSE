package com.tky.chapter21.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/18 10:35
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听，等待连接...");
        Socket socket = serverSocket.accept();
        //接收客户端的数据
        InputStream inputStream = socket.getInputStream();
        int readLen = 0;
        byte[] buf = new byte[8];
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        while ((readLen=bis.read(buf)) != -1) {
            System.out.print(new String(buf,0,readLen));
        }
        //给客户端发数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client~".getBytes());
        socket.shutdownOutput(); // 设置结束标记，表示数据已发送完毕
        //释放资源
        outputStream.close();
        bis.close();
        socket.close();
        serverSocket.close();
        System.out.println();
        System.out.println("服务端关闭...");

    }
}
