package com.tky.chapter23.reflection;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/22 19:10
 */
class A {
    public String hobby;
    public A() {}
    public void hi(){}
}
@Deprecated
public class Person extends A implements I1, I2{
    //属性
    public String name;
    protected int age;
    String job;
    private double sal;

    public Person() {}
    public Person(String name) {
        this.name = name;
    }
    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //方法
    public void m1(String name, int age, double sal) {}
    protected String  m2() {
        return null;
    }
    void m3() {}
    private void m4() {}
}
interface I1 {}
interface I2 {}