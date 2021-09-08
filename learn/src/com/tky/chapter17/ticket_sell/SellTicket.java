package com.tky.chapter17.ticket_sell;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/8 20:39
 * 多线程，模拟三个售票窗口同时售票
 */
public class SellTicket {
    public static void main(String[] args) {

        Seller01 seller01 = new Seller01();
        Seller01 seller02 = new Seller01();
        Seller01 seller03 = new Seller01();

        seller01.start();
        seller02.start();
        seller03.start();

    }
}

class Seller01 extends Thread {

    private static int ticketNum = 30;  //线程共享

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("票已售空...");
                break;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() +
                    "售出一张票，剩余票数=" + --ticketNum);
        }
    }
}