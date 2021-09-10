package com.tky.chapter17.homework;

import java.util.Scanner;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/10 20:19
 */
public class Homework01 {
    public static void main(String[] args) {

        AThread aThread = new AThread();
        BThread bThread = new BThread(aThread);

        aThread.start();
        bThread.start();

    }
}

class AThread extends Thread {

    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            System.out.println((int)(Math.random()*100+1)); //随机输出1~100的整数
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A线程结束...");
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class BThread extends Thread {

    private AThread a;
    private Scanner scanner = new Scanner(System.in);

    public BThread(AThread a) {
        this.a = a;
    }

    @Override
    public void run() {
        //接收用户输入
        System.out.println("请输入命令(Q)退出：");
        char command = scanner.next().toUpperCase().charAt(0);
        if (command == 'Q') {
            a.setLoop(false);   //通知AThread类线程结束
        }
    }

}