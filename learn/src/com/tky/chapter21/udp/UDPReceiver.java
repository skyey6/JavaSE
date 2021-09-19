package com.tky.chapter21.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/19 14:45
 * A端
 */
public class UDPReceiver {
    public static void main(String[] args) throws IOException {

        //1. 创建一个 DatagramSocket 对象，准备在 9999 发送/接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9999);

        //2. 构建一个 DatagramPacket 对象，准备接收数据
        // 理论上，一个UDP数据包最大 64KB
        byte[] buf = new byte[2048];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        //3. 调用 接收方法，将通过网络传输的 DatagramPacket 对象，填充到 packet 中
        //提示: 当有数据包发送到 本机的 9999 端口时，就会接收到数据
        // 如果没有数据包发送到 本机的 9999 端口, 就会阻塞等待
        System.out.println("接收端等待接收数据...");
        datagramSocket.receive(packet);

        //4. 可以把 packet 进行拆包，取出数据，并显示
        int length = packet.getLength(); //实际接收到的数据长度
        byte[] data = packet.getData();  //接收到的数据
        System.out.println(new String(data, 0, length));

        //给B端发送回应
        data = "好的，明天见。".getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("127.0.0.1"), 9998);
        datagramSocket.send(packet);

        //关闭资源
        datagramSocket.close();
        System.out.println("A端退出...");

    }
}
