package com.tky.chapter17.homework;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/10 20:52
 */
public class Homework02 {
    public static void main(String[] args) {
        Account user01 = new Account();
        Account user02 = new Account();
        user01.setName("user01");
        user02.setName("user02");

        user01.start();
        user02.start();
    }
}

class Account extends Thread {

    private static int money = 10000;  //账户余额

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Account.class) { //获取锁
                if (money < 1000) {   //判断余额是否足够
                    System.out.println("账户余额为0！");
                    break;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + "取走1000元，账户余额：" + money);
            }
        }
    }

}
