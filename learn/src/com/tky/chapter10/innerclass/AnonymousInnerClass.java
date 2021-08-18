package com.tky.chapter10.innerclass;

/**
 * 演示匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer02 outer = new Outer02();
        outer.method();
    }
}

class Outer02 { //外部类
    private int n1 = 10;

    public void method() { //方法
        //基于接口的匿名内部类
        //1.需求： 想使用 IA 接口,并创建对象
        // 2.传统方式是:写一个类，实现该接口，并创建对象
        // 3.当前需求是:Tiger/Dog 类只是使用一次，后面再不使用
        // 4.可以使用匿名内部类来简化开发
        // 5.tiger的编译类型：IA
        // 6.tiger的运行类型：就是匿名内部类, Outer02$1
        /*  底层：
            class Outer02$1 implements IA {
                @Override
                public void cry() {
                    System.out.println("老虎吼叫...");
                }
            }
         */
        // 7.jdk 底层在创建匿名内部类 Outer02$1时，立即创建了 Outer02$1 实例，
        //   并且把地址返回给 tiger
        // 8.匿名内部类使用一次，就不能再使用
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎吼叫...");
            }
        };
        tiger.cry();
        System.out.println("tiger的运行类型：" + tiger.getClass());   //Outer02$1

//        IA tiger = new Tiger();
//        tiger.cry();

        //基于类的匿名内部类
        // 1. father 编译类型 Father
        // 2. father 运行类型 Outer02$2
        // 3. 底层会创建匿名内部类
        /*
            class Outer02$2 extends Father {
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test方法");
                }
            }
         */
        // 4. 同时也直接返回了 匿名内部类 Outer02$2 的对象
        // 5. 注意("jack") 参数列表会传递给 构造器
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass());  //Outer02$2
        father.test();
    }
}

interface IA {
    void cry();
}

//class Tiger implements IA{
//    @Override
//    public void cry() {
//        System.out.println("老虎吼叫...");
//    }
//}

class Father {

    public Father(String name) {

    }

    public void test() {

    }
}

