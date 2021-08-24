package com.tky.chapter13.homework;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/24 16:57
 */
/*
 * (1)编写java程序，输入形式为:Han shun Ping的人名，以Ping,Han .S的形式打印出来。
 *    其中.S是中间单词的首字母。
 * (2)例如输入“William Jefferson Clinton”，输出形式为:Clinton,William .J
 */
public class Homework03 {
    public static void main(String[] args) {
        String name = "Tian kai yuan";
        System.out.println(nameFormatter(name));
        name = "William Jefferson Clinton";
        System.out.println(nameFormatter(name));
    }

    public static String nameFormatter(String name) {

        if (name == null){
            throw new RuntimeException("输入不能为空");
        }

        String[] strings = name.split(" ");
        if (strings.length != 3) {
            throw new RuntimeException("名字格式有误");
        }

        //也可以使用String.format进行格式化
        //String.format("%s,%s .%c", strings[2],strings[0],strings[1].toUpperCase().charAt(0));
        StringBuilder sb = new StringBuilder();
        sb.append(strings[2]);
        sb.append(",");
        sb.append(strings[0]);
        sb.append(" .");
        sb.append(strings[1].toUpperCase().charAt(0));
        return sb.toString();
    }
}
