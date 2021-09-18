package com.tky.chapter21.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/18 10:35
 */
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //给服务端发数据
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        bos.write("hello,server~".getBytes());
        bos.flush();  // 写出
        socket.shutdownOutput(); // 设置结束标记，表示数据已发送完毕
        //接收来自服务端的数据
        InputStream inputStream = socket.getInputStream();
        int readLen = 0;
        byte[] buf = new byte[8];
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        while ((readLen=bis.read(buf)) != -1) {
            System.out.print(new String(buf,0,readLen));
        }
        //释放资源
        bis.close();
        outputStream.close();
        socket.close();
        System.out.println();
        System.out.println("客户端关闭...");

    }
}
