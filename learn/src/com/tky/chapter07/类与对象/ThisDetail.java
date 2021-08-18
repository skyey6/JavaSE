package com.tky.chapter07.类与对象;

public class ThisDetail {
    public static void main(String[] args) {
        T t = new T();
        t.f2();
    }
}

class T {

    /*
    this可以用来在构造器中访问另一个构造器
     */
    public T() {
        this("jack", 3);
        System.out.println("T()构造器");
    }

    public T(String name, int age) {
        System.out.println("T(String name, int age)构造器");
    }

    public void f1() {
        System.out.println("f1() 方法被调用");
    }

    public void f2() {
        System.out.println("f2() 方法被调用");
        f1();
        this.f1();
    }

}
