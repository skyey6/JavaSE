package com.tky.chapter11.annotation_;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/19 19:48
 */
public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}

//1. @Deprecated 修饰某个元素, 表示该元素已经过时
//2. 即不在推荐使用，但是仍然可以使用
//3. 查看 @Deprecated 注解类的源码
//4. 可以修饰方法，类，字段, 包, 参数 等等
//5. @Deprecated 可以做版本升级过渡使用
@Deprecated
class A {
    public int n1 = 10;

    @Deprecated
    public void hi() {}
}
