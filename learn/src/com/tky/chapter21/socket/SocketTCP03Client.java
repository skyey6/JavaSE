package com.tky.chapter21.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/18 11:28
 * 客户端，发送 "hello, server" 给服务端， 使用字符流
 */
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 10086);
        //给服务端发数据
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("hello,server~");
        bw.flush();  // 写出
        socket.shutdownOutput(); // 设置结束标记，表示数据已发送完毕
        //接收来自服务端的数据
        InputStream inputStream = socket.getInputStream();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        while ((line=br.readLine()) != null) {
            System.out.print(line);
        }
        //释放资源
        br.close();
        bw.close();
        socket.close();
        System.out.println();
        System.out.println("客户端关闭...");
    }
}
