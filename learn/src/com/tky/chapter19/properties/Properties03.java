package com.tky.chapter19.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/15 16:37
 * 使用 Properties 类来创建 配置文件, 修改配置文件内容
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
        //Properties 父类是 Hashtable ， 底层就是一个 Hashtable

        String path = "learn/src/com/tky/chapter19/mongodb.properties";
        String comments = "a description of the property list.";
        //1. 创建 Properties 对象
        Properties properties = new Properties();
        //2. 编写配置文件
        /*
            1.如果该文件没有此 key 就是创建新键值对
            2.如果该文件有此 key 就是对其值进行修改
         */
        properties.setProperty("charset", "utf-8");
        properties.setProperty("user", "汤姆");
        properties.setProperty("pwd", "abc123");
        //3.保存
        properties.store(new FileWriter(path), comments);

    }
}
