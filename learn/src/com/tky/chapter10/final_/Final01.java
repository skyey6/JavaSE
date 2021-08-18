package com.tky.chapter10.final_;

public class Final01 {
    public static void main(String[] args) {
//        new E().TAX_RATE = 8;   //Cannot assign a value to final variable 'TAX_RATE'
    }
}

final class A {

}

//class B extends A {}

class C {
    //如果要求hi不能被子类重写，可以用final修饰hi方法
    public final void hi() {}
}

/*
class D extends C {
    @Override
    public void hi() {
        System.out.println("重写了C类的hi方法...");
    }
}*/

//当不希望类的的某个属性的值被修改,可以用 final 修饰
class E {
    public final double TAX_RATE = 0.08;
}