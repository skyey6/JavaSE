package com.tky.chapter10.interface_.interface01;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Camera camera = new Camera();

        Computer computer = new Computer();
        computer.doSomeWork(phone);
        System.out.println("=====================");
        computer.doSomeWork(camera);
    }
}
