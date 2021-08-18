package com.tky.chapter10.interface_.interface01;

public class Computer {

    public void doSomeWork(Usb usb) {
        if (usb instanceof Phone) {
            System.out.println("手机接入电脑的usb接口");
        } else if (usb instanceof Camera) {
            System.out.println("相机接入电脑的usb接口");
        }
        usb.start();
        usb.stop();
    }
}
