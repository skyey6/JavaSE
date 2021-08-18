package com.tky.chapter10.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
//        new A();
//        new B();
//        System.out.println(A.name);
//        System.out.println(B.name);
//        new A();
//        new A();
    }
}

class A {
    static String name = "A的静态属性";

    //静态代码块
    static {
        System.out.println("A的静态代码块被执行...");
    }
    //普通代码块
    {
        System.out.println("A的代码块被执行...");
    }
}

class B extends A {
    static String name = "B的静态属性";

    //静态代码块
    static {
        System.out.println("B的静态代码块被执行...");
    }
    //普通代码块
    {
        System.out.println("B的代码块被执行...");
    }
}
