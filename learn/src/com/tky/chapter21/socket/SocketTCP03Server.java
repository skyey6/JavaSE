package com.tky.chapter21.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/18 11:28
 * 服务端, 使用字符流方式读写
 */
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务端在10086端口监听，等待连接...");
        Socket socket = serverSocket.accept();
        //接收客户端的数据
        InputStream inputStream = socket.getInputStream();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        while ((line=br.readLine()) != null) {
            System.out.print(line);
        }
        //给客户端发数据
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("hello,client~");
        bw.newLine(); //插入一个换行符，表示写入的内容结束, 注意，要求对方使用 readLine()!
        bw.flush();  // 写出
//        socket.shutdownOutput(); // 设置结束标记，表示数据已发送完毕
        //释放资源
        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
        System.out.println();
        System.out.println("服务端关闭...");
    }
}
