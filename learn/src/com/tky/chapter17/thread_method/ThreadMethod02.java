package com.tky.chapter17.thread_method;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/9 17:17
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {

        T2 t2 = new T2();
        t2.setName("t2");
        t2.start();


        for (int i = 0; i < 20; i++) {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + "运行中... " + i);
            if (i == 5) {
                System.out.println("=====主线程main让线程t2插队了=====");
                t2.join();
//                Thread.yield();   //main 礼让，让出CPU，不一定成功
            }
        }
    }
}

class T2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(500); //休眠
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行中... " + i);
        }

    }

}