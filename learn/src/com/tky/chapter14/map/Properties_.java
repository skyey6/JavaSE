package com.tky.chapter14.map;

import java.util.Properties;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/4 16:57
 */
public class Properties_ {
    public static void main(String[] args) {

        Properties properties = new Properties();
        //properties.put(null, "abc"); //抛出 空指针异常
        //properties.put("abc", null); //抛出 空指针异常
        properties.put("john", 100);//k-v
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);//如果有相同的 key ， value 被替换

        System.out.println("properties = " + properties);

        //通过key获取对应的value
        Object lic = properties.get("lic");
        System.out.println(lic); //88

        //删除
        properties.remove("lic");

        //修改
        properties.put("john", "haha");
        System.out.println("properties = " + properties);
        properties.setProperty("john", "haha123"); //推荐使用
        System.out.println("properties = " + properties);


    }
}
