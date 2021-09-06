package com.tky.chapter15.customgeneric;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/6 10:33
 */
public class CustomGeneric {
    public static void main(String[] args) {

    }
}

//1. Tiger 后面泛型，所以我们把 Tiger 就称为自定义泛型类
// 2. T, R, M 泛型的标识符, 一般是单个大写字母
// 3. 泛型标识符可以有多个.
// 4. 普通成员可以使用泛型 (属性、方法)
// 5. 使用泛型的数组，不能初始化
// 6. 静态方法中不能使用类的泛型
class Tiger<T, R, M> {
    String name;
    T t;
    R r;
    M m;
    T[] ts;

    public Tiger(String name, T t, R r, M m) {
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}