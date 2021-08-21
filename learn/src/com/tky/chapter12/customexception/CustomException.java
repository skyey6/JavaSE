package com.tky.chapter12.customexception;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/21 20:03
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if (!(age>=18 && age<=120)) {
            throw new AgeException("年龄不在指定范围");
        }
        System.out.println("" + age);
    }
}

//自定义异常类
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
