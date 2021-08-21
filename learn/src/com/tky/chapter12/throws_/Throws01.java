package com.tky.chapter12.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/21 18:57
 */
public class Throws01 {
    public static void main(String[] args) {
        try {
            file();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void file() throws FileNotFoundException,NullPointerException {
        //编译时异常，必须处理，否则不能通过编译
        //抛出异常，让file方法的调用者处理
        FileInputStream fis = new FileInputStream("hello.txt");
    }
}
