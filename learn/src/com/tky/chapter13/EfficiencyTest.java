package com.tky.chapter13;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/23 17:58
 */
public class EfficiencyTest {
    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;
        StringBuffer buffer = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {//StringBuffer 拼接 20000 次
            buffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer 的执行时间：" + (endTime - startTime));

        StringBuilder builder = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {//StringBuffer 拼接 20000 次
            builder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder 的执行时间：" + (endTime - startTime));

        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {//StringBuffer 拼接 20000 次
            text += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String 的执行时间：" + (endTime - startTime));
    }
}
