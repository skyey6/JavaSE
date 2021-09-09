package com.tky.chapter17.sync;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/8 20:39
 * 多线程，模拟三个售票窗口同时售票
 */
public class SellTicket {
    public static void main(String[] args) {

        Seller seller = new Seller();
        Thread s01 = new Thread(seller);
        Thread s02 = new Thread(seller);
        Thread s03 = new Thread(seller);
        s01.setName("s01");
        s02.setName("s02");
        s03.setName("s03");

        s01.start();
        s02.start();
        s03.start();

    }
}

//使用了 synchronized 实现线程同步
class Seller implements Runnable {

    private boolean loop = true;
    private int ticketNum = 30;  //线程共享

    public synchronized void sell() {
        if (ticketNum <= 0) {
            loop = false;
            System.out.println("票已售空...");
            return;
        }

        System.out.println("窗口" + Thread.currentThread().getName() +
                "售出一张票，剩余票数=" + --ticketNum);
    }

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sell();
        }
    }

}