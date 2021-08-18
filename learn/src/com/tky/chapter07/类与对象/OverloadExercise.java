package com.tky.chapter07.类与对象;

public class OverloadExercise {
    public static void main(String[] args) {
        Methods method = new Methods();
        method.m(10);
        method.m(10, 20);
        method.m("hello");
    }
}

class Methods{

    public void m(int a){
        System.out.println("平方=" + a * a);
    }

    public void m(int a, int b){
        System.out.println("相乘=" + a * b);
    }

    public void m(String s){
        System.out.println("字符串=" + '\'' + s + '\'');
    }

}
