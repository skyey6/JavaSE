package com.tky.chapter19.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/15 18:44
 */
public class Homework02 {
    public static void main(String[] args) {

        String path = "E:\\javase\\test\\code.txt";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(++count + "\t" + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
