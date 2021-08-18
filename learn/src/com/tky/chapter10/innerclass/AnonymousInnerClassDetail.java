package com.tky.chapter10.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer03 outer = new Outer03();
        outer.f1();
    }
}

class Outer03 {
    private int n1 = 99;

    public void f1(){
        //创建一个基于类的匿名内部类
        Person p = new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类 hi()");
            }
        };
        p.hi(); //调用方法 方式一

        new Person() {
            int n1 = 8;
            @Override
            public void hi() {
                System.out.println("匿名内部类 hi()");
                System.out.println("匿名内部类的n1=" + n1 + " 外部类的n1=" + Outer03.this.n1);
            }
        }.hi(); //调用方法 方式二

    }
}

class Person {//普通类
    public void hi() {
        System.out.println("Person hi()");
    }
}


