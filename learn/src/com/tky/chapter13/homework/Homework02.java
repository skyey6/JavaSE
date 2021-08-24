package com.tky.chapter13.homework;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/24 16:39
 */
public class Homework02 {
    public static void main(String[] args) {
        register("haha","123456","h1@sohu.com");
    }

    public static void register(String username, String password, String email) {
        if (!(username.length()>=2 && username.length()<=4)){
            throw new RuntimeException("用户名长度应该为2或3或4");
        }

        boolean isDigit;
        try {
            Integer.valueOf(password);
            isDigit = true;
        } catch (NumberFormatException e) {
            System.out.println("密码应全是数字 " + e.getMessage());
            return;
        }
        if (password.length()!=6) {
            throw new RuntimeException("密码长度应该为6");
        }

        int i1 = email.indexOf("@");
        int i2 = email.indexOf(".");
        if (!(i1>0 && i1<i2)){
            throw new RuntimeException("邮箱中应包含@和.   且@在.之前");
        }

        System.out.println("注册成功！");
    }
}
