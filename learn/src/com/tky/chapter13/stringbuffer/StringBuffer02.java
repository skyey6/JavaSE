package com.tky.chapter13.stringbuffer;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/23 16:06
 */
public class StringBuffer02 {
    public static void main(String[] args) {
        //构造器的使用

        //1.默认创建一个长度16的 char[]
        StringBuffer buffer1 = new StringBuffer();

        //2.通过构造器指定 char[] 的大小
        StringBuffer buffer2 = new StringBuffer(100);

        //3.通过给一个 String 来创建，此时 char[] 初始长度为：给的字符串长度加16
        StringBuffer buffer3 = new StringBuffer("hi");
    }
}
