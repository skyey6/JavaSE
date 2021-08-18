package com.tky.chapter10.final_;


public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);    //10000
//        BBB.sayHi();

        //包装类,String 是 final 类，不能被继承
//        String
    }
}

//final 和 static 往往搭配使用，效率更高，直接使用属性时不会导致类加载.底层编译器做了优化处理
class BBB {
    public final static int num = 10000;

    public final static void sayHi() {
        System.out.println("hi!");
    }

    static {
        System.out.println("BBB 静态代码块被执行");
    }

}

final class AAA {
    //一般来说，如果一个类已经是 final 类了，就没有必要再将方法修饰成 final 方法
    public final void cry() {}
}
