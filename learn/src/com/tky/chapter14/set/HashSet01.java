package com.tky.chapter14.set;

import java.util.HashSet;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/27 20:51
 */
public class HashSet01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        HashSet set = new HashSet();

        //1. 在执行 add 方法后，会返回一个 boolean 值
        //2. 如果添加成功，返回 true, 否则返回 false
        //3. 可以通过 remove 指定删除哪个对象

        System.out.print(set.add("john"));//T
        System.out.print(set.add("lucy"));//T
        System.out.print(set.add("john"));//F
        System.out.print(set.add("jack"));//T
        System.out.println(set.add("Rose"));//T

        set.remove("john");
        System.out.println("set = " + set);

        //4. Hashset 不能添加相同的元素/数据
        set = new HashSet();
        System.out.println("set = " + set);
        set.add("lucy"); //成功
        set.add("lucy"); //失败，重复元素
        set.add(new Dog("tommy")); //成功
        set.add(new Dog("tommy")); //成功
        System.out.println("set = " + set);
        //加深理解
        //看源码: add的机制
        set.add(new String("tky")); //成功
        set.add(new String("tky")); //失败
        System.out.println("set = " + set);

    }
}

class Dog { //定义了 Dog 类
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }*/
}
