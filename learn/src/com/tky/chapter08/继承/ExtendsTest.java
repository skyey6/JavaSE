package com.tky.chapter08.继承;

public class ExtendsTest {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    public A() {
        System.out.println("A()被调用...");
    }
}

class B extends A {
    public B() {
        System.out.println("B()被调用...");
    }
}

class C extends B {
    public C() {
        System.out.println("C()被调用...");
    }
}
