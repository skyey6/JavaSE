package com.tky.chapter17.thread_method;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/9 16:27
 */
public class ThreadMethod01 {
    public static void main(String[] args) {
        T t = new T();
        t.setName("线程1");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("h1 " + i);
                Thread.sleep(1000); //休眠
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        t.interrupt();
        System.out.println(t.getPriority());

    }
}

class T extends Thread {

    private int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName() + "运行中... " + ++count);
        }
        try {
            System.out.println("休眠中~~");
            Thread.sleep(20000); //休眠
            System.out.println("休眠结束~~");
        } catch (InterruptedException e) {
            //当该线程的interrupt方法被调用时，会被捕获到，进入这里
            System.out.println(Thread.currentThread().getName() + "被中断");
        }
    }

}