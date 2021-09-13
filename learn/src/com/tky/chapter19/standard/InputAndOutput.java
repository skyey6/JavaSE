package com.tky.chapter19.standard;

import java.util.Scanner;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/12 20:24
 */
public class InputAndOutput {
    public static void main(String[] args) {

        // public final static InputStream in = null;
        System.out.println(System.in.getClass()); //class java.io.BufferedInputStream

        // public final static PrintStream out = null;
        System.out.println(System.out.getClass()); //class java.io.PrintStream

        Scanner scanner = new Scanner(System.in);
        System.out.print("输入内容：");
        String s = scanner.nextLine();
        System.out.println(s);

    }
}
