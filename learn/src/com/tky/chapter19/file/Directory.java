package com.tky.chapter19.file;

import java.io.File;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/11 15:14
 */
public class Directory {
    public static void main(String[] args) {
//        m1();
//        m2();
        m3();
    }

    public static void m1() {
        String filePath = "E:\\javase\\test\\haha.txt";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("该文件不存在...");
        }
    }

    //在java中，目录也被当成文件
    public static void m2() {
        String filePath = "E:\\javase\\test\\mydir";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("该目录不存在...");
        }
    }

    //判断 E:\javase\test\a\b\c 目录是否存在，如果不存在就创建目录
    public static void m3() {
        String directoryPath = "E:\\javase\\test\\a\\b\\c";
        File file = new File(directoryPath);

        if (file.exists()) {
            System.out.println(file.getAbsolutePath() + " 已存在");
        } else {
            if (file.mkdirs()) { //不能使用mkdir，mkdir只能创建一级目录
                System.out.println(file.getAbsolutePath() + " 创建成功");
            } else {
                System.out.println(file.getAbsolutePath() + " 创建失败");
            }
        }
    }
}
