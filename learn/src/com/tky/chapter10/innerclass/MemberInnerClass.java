package com.tky.chapter10.innerclass;

public class MemberInnerClass {
    public static void main(String[] args) {
        //外部其他类使用成员内部类的方式有两种

        // 一、
        new Outer04().new Inner().say();

        // 二、
        new Outer04().getInnerInstance().say();

    }
}

class Outer04 {
    private int n1 = 8;
    private String name = "张三";

    private void say() {
        System.out.println("Outer04 say()...");
    }

    public class Inner {
        public void say() {
            System.out.println("Inner say()...");
            //访问外部类的私有成员
            System.out.println("Outer04的n1=" + n1 + " Outer04的name=" + name);
            Outer04.this.say();
        }
    }

    public Inner getInnerInstance() {
        return new Inner();
    }

}
