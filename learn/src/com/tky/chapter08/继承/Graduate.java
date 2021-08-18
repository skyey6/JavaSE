package com.tky.chapter08.继承;

public class Graduate extends Student{
    public Graduate() {
        System.out.println("调用了Graduate构造器");
    }
    public void examing() {
        System.out.println("大学生" + name + "在考微积分(I)...");
    }
}
