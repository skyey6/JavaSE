package com.tky.chapter15.customgeneric;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/6 11:26
 */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

/*
    1. 接口中，静态成员也不能使用泛型
    2. 泛型接口的类型，在继承接口或者实现接口时确定
    3. 没有指定类型，默认为Object
 */
interface IUsb<U, R> {

    public static final int a = 1;
//    U name; //不能这样使用

    //普通方法中可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //jdk8 中，可以在接口中使用默认方法，也能使用泛型
    default R method(U u) {
        return null;
    }
}

//在继承接口 指定泛型接口的类型
interface IA extends IUsb<String, Double> {

}
//当我们去实现 IA 接口时，因为 IA 在继承 IUsb 接口时，指定了 U 为 String, R 为 Double
// ，在实现 IUsb 接口的方法时，使用 String 替换 U, 是 Double 替换 R
class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

//实现接口时，直接指定泛型接口的类型
class BB implements IUsb<Integer,Float> {

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}
