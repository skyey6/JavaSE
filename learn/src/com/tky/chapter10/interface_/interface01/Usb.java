package com.tky.chapter10.interface_.interface01;

public interface Usb {
    // 接口中的方法默认是抽象的，
    // 且被隐式的指定为 public abstract（只能是 public abstract，其他修饰符都会报错）。
    public abstract void start();

    void stop();

    int a = 1;

}


