package com.tky.chapter21.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/19 14:44
 * B端
 */
public class UDPSender {
    public static void main(String[] args) throws IOException {

        //1.创建 DatagramSocket 对象，准备在9998端口 发送/接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9998);

        //2. 将需要发送的数据，封装到 DatagramPacket 对象
        byte[] data = "hello，明天吃火锅~".getBytes();
        //封装的 DatagramPacket 对象: data内容字节数组, data.length, 主机(IP), 目标端口
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 9999);

        //3. 发送packet
        datagramSocket.send(packet);

        //接收A端的回应
        byte[] buf = new byte[2048];
        packet = new DatagramPacket(buf, buf.length);
        datagramSocket.receive(packet);
        int length = packet.getLength();
        data = packet.getData();
        System.out.println(new String(data, 0, length));

        //关闭资源
        datagramSocket.close();
        System.out.println("B端退出...");

    }
}
