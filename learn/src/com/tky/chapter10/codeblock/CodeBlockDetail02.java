package com.tky.chapter10.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        AA aa = new AA();
    }
}

class AA {
    private int n2 = getN2();   //普通属性的初始化

    //普通代码块
    {
        System.out.println("AA 普通代码块01");
    }
    //静态代码块
    static {
        System.out.println("AA 静态代码块01");
    }

    private static int n1 = getN1();    //静态属性的初始化

    public AA() {   //AA的无参构造器
        System.out.println("AA的无参构造器被调用");
    }

    public static int getN1() {
        System.out.println("getN1被调用...");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2被调用...");
        return 200;
    }
}
