package com.tky.chapter11.annotation_;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/19 19:32
 */
public class Override_ {
    public static void main(String[] args) {

    }
}

class Father {
    public void fly() {
        System.out.println("Father fly()");
    }
}

class Son extends Father {
    //1. @Override 注解放在 fly 方法上，表示子类的 fly 方法时重写了父类的 fly
    //2. 这里如果没有写 @Override 还是重写了父类 fly
    //3. 如果你写了@Override 注解，编译器就会去检查该方法是否真的重写了父类的方法，
    //  如果的确重写了，则编译通过，如果没有构成重写，则编译错误
    @Override
    public void fly() {
        System.out.println("Son fly()");
    }

//    @Override
//    public void hi () {} //Method does not override method from its superclass
}