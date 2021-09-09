package com.tky.chapter17.state;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/9 19:40
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        T thread = new T();

        System.out.println(thread.getName() + " 当前状态：" + thread.getState());
        thread.start();

        while (Thread.State.TERMINATED != thread.getState()) {
            System.out.println(thread.getName() + " 当前状态：" + thread.getState());
            Thread.sleep(500);
        }

        System.out.println(thread.getName() + " 当前状态：" + thread.getState());
    }
}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}
