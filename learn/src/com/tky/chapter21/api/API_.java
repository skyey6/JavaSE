package com.tky.chapter21.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/17 20:15
 * 演示 INetAddress 类的使用
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        // 获取本机 InetAddress 对象: getLocalHost
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        // 根据指定主机名/域名获取 InetAddress 对象: getByName
        InetAddress myHost = InetAddress.getByName("LAPTOP-T1VPFOTJ");
        System.out.println(myHost);
        InetAddress baidu = InetAddress.getByName("www.baidu.com");
        System.out.println(baidu);

        //获取 InetAddress 对象的主机名: getHostName
        String hostName = baidu.getHostName();
        System.out.println(hostName);

        //获取 InetAddress 对象的地址 getHostAddress
        String address = baidu.getHostAddress();
        System.out.println(address);

    }
}
