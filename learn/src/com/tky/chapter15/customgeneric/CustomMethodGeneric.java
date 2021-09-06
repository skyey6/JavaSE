package com.tky.chapter15.customgeneric;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/6 15:09
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {

        Car car = new Car();

        car.fly("bmw", 100);
        car.fly(12.0, 100);

    }
}

/*
    泛型方法，可以定义在普通类中，也可以定义在泛型类中
 */
class Car { //普通类

    public void run() {

    }

    public <T, R> void fly(T t, R r) {
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}

class Fish<T, R> { //泛型类

    public void run() {

    }

    public <U, M> void swim(U u, M m) { //泛型方法，标识符要和类的标识符区分开

    }

    //1. 下面 hi 方法不是泛型方法
    //2. 是 hi 方法使用了类声明的 泛型
    public void hi(T t) {
    }
}


