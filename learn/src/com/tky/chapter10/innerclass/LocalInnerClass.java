package com.tky.chapter10.innerclass;

/**
 * 局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1();

    }
}

class Outer {//外部类
    private int n1 = 100;

    public void m1() {//方法
        //局部内部类不能添加访问修饰符，可以使用final修饰
        //作用域仅仅在定义它的方法或代码块内
        final class Inner {//局部内部类
            private int n1 = 800;   //与外部类成员重名

            public void f1() {
                //  Outer.this 本质是外部类的对象，
                //  即哪个对象调用了m1方法，Outer.this就是哪个对象
                System.out.println("n1=" + n1 + " 外部类的n1=" + Outer.this.n1);  //能够直接访问外部类的私有成员
                m2();   //外部类的私有方法
            }
        }
        Inner inner = new Inner();
        inner.f1();
    }

    {
        class Inner02 {}
    }

    private void m2() {
        System.out.println("Outer m2()");
    }
}
