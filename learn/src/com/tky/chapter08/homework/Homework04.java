package com.tky.chapter08.homework;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("张三", 300, 30, 1.2);
        manager.setBonus(3000); //设置经理的奖金
        manager.printSal();

        Worker worker = new Worker("小李", 100, 30, 1.0);
        worker.printSal();

    }
}
