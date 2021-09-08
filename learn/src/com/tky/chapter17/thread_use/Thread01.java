package com.tky.chapter17.thread_use;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/8 18:31
 */
public class Thread01 {
    public static void main(String[] args) {

        //创建 Cat 对象，可以当做线程使用
        Cat cat = new Cat();

        /*
            (1)
                public synchronized void start() {
                    start0();
                }
            (2)
                start0() 是本地（native）方法，由 JVM 调用, 底层是 c/c++实现
                真正实现多线程的效果，是 start0(), 而不是 run()
                private native void start0();
         */

        cat.start(); //启动线程 -> 最终会执行 cat 的 run 方法

        //cat.run();//run 方法就是一个普通的方法，没有真正的启动一个线程，还是在main线程中执行

        //说明: 当 main 线程启动一个子线程 Thread-0, 主线程不会阻塞, 会继续执行
        //      这时，主线程和子线程交替执行..
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t线程名：" + Thread.currentThread());
            try {
                Thread.sleep(1000); //休眠一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//1. 当一个类继承了 Thread 类， 该类就可以当做线程使用
// 2. 重写 run 方法，写上自己的业务代码
// 3. Thread 类 实现了 Runnable 接口的 run 方法
class Cat extends Thread {

    int count = 0;

    @Override
    public void run() {
        for (; true; ) {
            System.out.println("这是一只猫" + ++count + "\t线程名：" + Thread.currentThread());
            try {
                Thread.sleep(1000); //休眠一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10)
                break;
        }
    }
}
