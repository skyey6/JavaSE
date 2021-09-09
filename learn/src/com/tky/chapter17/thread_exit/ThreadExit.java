package com.tky.chapter17.thread_exit;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/9 15:57
 */
public class ThreadExit {
    public static void main(String[] args) {
        T t = new T();
        t.start();

        //让主线程休眠 10 秒，再通知t线程退出
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.setLoop(false);


    }
}

class T extends Thread {

    private int count = 0;
    //设置一个控制变量
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行中..." + ++count);
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
