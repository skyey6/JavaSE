package com.tky.chapter08.继承;

public class Pupil extends Student {
    public Pupil() {
        System.out.println("调用了Pupil构造器");
    }

    public void examing() {
        System.out.println("小学生" + name + "在考小学数学...");
    }
}
