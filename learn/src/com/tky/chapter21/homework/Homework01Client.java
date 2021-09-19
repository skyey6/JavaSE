package com.tky.chapter21.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/19
 * 客户端，使用字符流
 */
public class Homework01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8899);
        Scanner scanner = new Scanner(System.in);
        //给服务端发数据
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        System.out.print("输入要发送的内容：");
        bw.write(scanner.nextLine());
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
