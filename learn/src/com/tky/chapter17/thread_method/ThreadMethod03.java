package com.tky.chapter17.thread_method;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/9 17:51
 */
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemon myDaemon = new MyDaemon();
        myDaemon.setDaemon(true);
        myDaemon.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("用户进程在执行一项工作... " + i);
        }
    }
}

class MyDaemon extends Thread {
    @Override
    public void run() {
        for (; ; ) { //无限循环
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\t守护进程：正在守护用户进程...");
        }
    }
}
