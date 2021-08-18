package com.tky.chapter10.codeblock;

public class CodeBlockExercise02 {
    public static void main(String[] args) {
        Test a = new Test();
        //1.类加载（调用静态代码块、初始化静态属性）
        //2.调用普通代码块、初始化普通属性
        //3.调用构造器
    }
}

class Sample {
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("Sample 默认构造函数被调用");
    }
}

class Test {
    Sample sam1 = new Sample("sam1 成员初始化");
    static Sample sam = new Sample("静态成员 sam 初始化 ");

    static {
        System.out.println("static 块执行");
        if (sam == null) System.out.println("sam is null");
    }

    Test() {//构造器
        System.out.println("Test 默认构造函数被调用");
    }
}