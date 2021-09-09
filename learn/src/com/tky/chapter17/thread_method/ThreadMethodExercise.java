package com.tky.chapter17.thread_method;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/9 17:28
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {

        T3 t3 = new T3();
        Thread thread = new Thread(t3);
        thread.setName("thread-3");

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " hi " + i);
            if (i == 5) {
                thread.start();
                thread.join();
            }
        }
        System.out.println("=====主线程结束=====");
    }
}

class T3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " hello " + i);
        }
        System.out.println("=====子线程结束=====");
    }
}


