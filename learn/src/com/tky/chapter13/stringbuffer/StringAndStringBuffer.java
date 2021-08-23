package com.tky.chapter13.stringbuffer;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/23 16:12
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String -> StringBuffer
        //方式1 使用构造器
        //注意： 返回的才是 StringBuffer 对象，对 str 本身没有影响
        String str = "hello tom";
        StringBuffer buffer = new StringBuffer(str);

        //方式2 使用的是 append 方法
        StringBuffer buffer1 = new StringBuffer();
        buffer1.append(str);


        //StringBuffer -> String
        //方式1 使用 StringBuffer 提供的 toString 方法
        StringBuffer buffer2 = new StringBuffer("hi,tky");
        String s = buffer2.toString();

        //方式2 使用构造器来搞定
        String s1 = new String(buffer2);

    }
}
