package com.tky.chapter12.throws_;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/21 19:04
 */
public class ThrowsDetail {
    public static void main(String[] args) {

    }

    public static void f1() {

    }
}

class Father {
    public void method() throws NullPointerException {
    }
}

class Son extends Father {
    @Override
    public void method() throws NullPointerException, ClassCastException {
    }
}
