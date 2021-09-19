package com.tky.chapter21.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/19
 * 服务端, 使用字符流方式读写
 */
public class Homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8899);
        System.out.println("服务端在8899端口监听，等待连接...");
        Socket socket = serverSocket.accept();
        //接收客户端的数据
        InputStream inputStream = socket.getInputStream();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        BufferedWriter bw = null;
        line=br.readLine();
        System.out.println("客户端请求：" + line);
        //给客户端发数据
        OutputStream outputStream = socket.getOutputStream();
        if ("name".equals(line)) {
            bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            bw.write("我是tky。");
            bw.newLine(); //插入一个换行符，表示写入的内容结束, 注意，要求对方使用 readLine()!
            bw.flush();  // 写出
        } else if ("hobby".equals(line)) {
            bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            bw.write("编写java程序...");
            bw.newLine(); //插入一个换行符，表示写入的内容结束, 注意，要求对方使用 readLine()!
            bw.flush();  // 写出
        } else {
            bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            bw.write("你说啥呢？");
            bw.newLine(); //插入一个换行符，表示写入的内容结束, 注意，要求对方使用 readLine()!
            bw.flush();  // 写出
        }
        //释放资源
        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端关闭...");
    }
}
