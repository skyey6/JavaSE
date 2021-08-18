package com.tky.chapter08.多态;

public class Test {
    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(b.count);
        Sub s = (Sub)b;
        System.out.println(s.count);
    }
}

class Base {
    int count = 10;
}

class Sub extends Base {
    int count = 20;
}
