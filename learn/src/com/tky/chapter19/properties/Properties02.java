package com.tky.chapter19.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/15 16:22
 * 使用 Properties 类来读取 mysql.properties 文件
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {

        String path = "learn/src/com/tky/chapter19/mysql.properties";
        //1. 创建 Properties 对象
        Properties properties = new Properties();
        //2. 加载指定配置文件
        properties.load(new FileReader(path));
        //3. 把 k-v 显示控制台
            // public void list(PrintStream out)
            // public void list(PrintWriter out)
        properties.list(System.out);
        //4. 根据 key 获取对应的值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("user: " + user);
        System.out.println("pwd: " + pwd);

    }
}
