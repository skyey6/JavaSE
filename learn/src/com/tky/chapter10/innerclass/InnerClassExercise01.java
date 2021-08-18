package com.tky.chapter10.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("芜~");
            }
        });
    }

    //静态方法，形参是接口类型
    public static void f1(IL il) {
        il.show();
    }
}

//接口
interface IL {
    void show();
}