package com.tky.chapter10.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        new Outer05().m1();
        System.out.println("==============");

        //外部其他类使用静态内部类
        //方式一
        Outer05.Inner inner1 = new Outer05.Inner();
        inner1.say();
        System.out.println("==============");
        //方式二，编写一个可以返回静态内部类实例的方法
        Outer05.Inner inner2 = new Outer05().getInnerInstance();
        inner2.say();


    }
}

class Outer05 {

    private int n1 = 10;
    private static String name = "张三";

    private static void cry() {
    }

    //静态内部类
    public static class Inner {

        private String name = "mls";

        public void say() {
//            System.out.println(n1);   //不能访问非静态成员
            System.out.println("Outer05 name=" + Outer05.name + " Inner name=" + name);
        }
    }

    public Inner getInnerInstance() {
        return new Inner();
    }

    public void m1() {
        new Inner().say();
    }
}