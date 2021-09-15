package com.tky.chapter19.properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/15 16:08
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {

        //读取 mysql.properties 文件，并得到 ip, user 和 pwd
        String path = "learn/src/com/tky/chapter19/mysql.properties";
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(path));
        while ((line = reader.readLine()) != null) {
            String[] split = line.split("=");
            //如果我们要求指定的 ip 值
            if ("ip".equals(split[0])) {
                System.out.println(split[0] + " 的值为：" + split[1]);
            }
        }
        reader.close();

    }
}
