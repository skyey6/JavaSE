package com.tky.chapter10.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        phone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了！！！");
            }
        });
        phone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了！！！");
            }
        });
    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClock(Bell bell) {
        bell.ring();    //动态绑定
    }
}
