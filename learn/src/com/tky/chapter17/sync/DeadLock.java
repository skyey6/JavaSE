package com.tky.chapter17.sync;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/10 19:44
 */
public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        DeadLockDemo t1 = new DeadLockDemo(true);
        t1.setName("线程A");
        DeadLockDemo t2 = new DeadLockDemo(false);
        t2.setName("线程B");

        t1.start();
        t2.start();

        while (true) {
            System.out.println("线程A 状态：" + t1.getState() + "，线程B 状态：" + t2.getState());
            Thread.sleep(1000);
        }
    }
}

class DeadLockDemo extends Thread {
    static Object o1 = new Object();// 保证多线程，共享一个对象,这里使用 static
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {//构造器
        this.flag = flag;
    }

    @Override
    public void run() {
        // 1. 如果 flag 为 true, 线程A 就会先得到/持有 o1 对象锁, 然后尝试去获取 o2 对象锁
        // 2. 如果 线程A 得不到 o2 对象锁，就会 Blocked
        // 3. 如果 flag 为 false, 线程B 就会先得到/持有 o2 对象锁, 然后尝试去获取 o1 对象锁
        // 4. 如果 线程B 得不到 o1 对象锁，就会 Blocked
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "获得o1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "获得o2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "获得o2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "获得o1");
                }
            }
        }
    }
}