package com.tky.chapter21.socket;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/18 9:47
 * TCP服务端
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //1. 在本机 的 9999 端口监听, 等待连接
        // 细节: 要求在本机没有其它服务占用 9999 端口
        //      这个 ServerSocket 可以通过 accept() 返回多个 Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        //2. 当没有客户端连接 9999 端口时，程序会 阻塞, 等待连接
        // 如果有客户端连接，则会返回 Socket 对象，程序继续
        System.out.println("服务端在9999端口监听，等待连接...");
        Socket socket = serverSocket.accept();
//        System.out.println("服务器 socket：" + socket.getClass());
        //3. 通过 socket.getInputStream() 读取客户端写入到数据通道的数据, 显示
        //  如果客户端没有发送数据，服务端阻塞
        InputStream inputStream = socket.getInputStream();
        //4. I/O读取
        int readLen;
        byte[] buf = new byte[8];
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        while ((readLen=bis.read(buf)) != -1) {
            //根据读取到的实际长度，显示内容
            System.out.print(new String(buf,0,readLen));
        }
        //5. 关闭流和socket
        bis.close();
        socket.close();
        serverSocket.close();
        System.out.println();
        System.out.println("服务端关闭...");

    }
}
