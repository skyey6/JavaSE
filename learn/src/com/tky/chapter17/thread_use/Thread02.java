package com.tky.chapter17.thread_use;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/8 19:48
 */
public class Thread02 {
    public static void main(String[] args) {

        Dog dog = new Dog();

        // 静态代理
        Thread t1 = new Thread(dog);
        /* dog 被传给 Thread类 中的 private Runnable target 属性
            public void run() {
                if (target != null) {
                    target.run(); //动态绑定机制
                }
            }
         */
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t线程名：" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); //休眠一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

class Animal {}

class Dog extends Animal implements Runnable {

    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("一只狗..hi\t" + ++count + '\t'
                    + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10)
                break;
        }
    }
}
