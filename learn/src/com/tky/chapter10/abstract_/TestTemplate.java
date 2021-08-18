package com.tky.chapter10.abstract_;

public class TestTemplate {
    public static void main(String[] args) {
        new A().calculateTime();
    }
}

class A extends Template {

    @Override
    public void job() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("A 执行任务1中..." + i);
        }
    }
}

class B extends Template {

    @Override
    public void job() {
        for (int i = 1; i <= 3000; i++) {
            System.out.println("B 执行任务2中..." + i);
        }
    }
}
