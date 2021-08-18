package com.tky.chapter10.interface_.interface01;

public class Phone implements Usb {

    @Override
    public void start() {
        System.out.println("手机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作...");
    }
}
