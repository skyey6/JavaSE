package com.tky.chapter10.interface_;

public class InterfacePolyParam {
    public static void main(String[] args) {
        A a01 = new Monster();
        A a02 = new Car();
        a01.move();
        a02.move();

    }
}

interface A {
    int num = 10;
    void move();
}

class Monster implements A {

    @Override
    public void move() {
        System.out.println("Monster is moving...");
    }
}

class Car implements A {

    @Override
    public void move() {
        System.out.println("Driving...");
    }
}
