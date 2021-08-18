package com.tky.chapter10.abstract_;

public class Abstract01 {
    public static void main(String[] args) {
//        new Animal();   //'Animal' is abstract; cannot be instantiated
        //实现了所有抽象方法的子类可以实例化
        Dog dog = new Dog("小黄");
        dog.eat();
    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //抽象方法
    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("狗："+ getName() +"爱吃骨头");
    }
}

