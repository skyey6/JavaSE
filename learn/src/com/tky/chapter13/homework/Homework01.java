package com.tky.chapter13.homework;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/24 16:01
 */
public class Homework01 {
    public static void main(String[] args) {

        String s = "hello";
        try {
            System.out.println(reverse(s,1,3));
            System.out.println(reverse("abcdef",0,4));
            System.out.println(reverse(null,1,4));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(s);
    }

    /**
     * 对字符串中指定部分进行反转。如"abcdef"->"aedcbf"
     * @param str
     * @param start
     * @param end
     * @return
     */
    public static String reverse(String str, int start, int end) {
        if (str == null){
            throw new NullPointerException("传入了null");
        }
        if (start >= end) {
            throw new RuntimeException("起始位置应小于终止位置");
        }
        if (end >= str.length()) {
            throw new ArrayIndexOutOfBoundsException("终止位置超过数组范围");
        }

        int p=start, q=end;
        char temp;
        char[] chars = str.toCharArray();

        for (int i = 0; i < (end-start+1)/2; i++) {
            temp = chars[p];
            chars[p++] = chars[q];
            chars[q--] = temp;
        }

        return new String(chars);
    }
}
