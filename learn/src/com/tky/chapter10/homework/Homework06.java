package com.tky.chapter10.homework;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/20 11:46
 */
public class Homework06 {
    public static void main(String[] args) {
        Person p = new Person("唐僧");

        System.out.println("平时使用马代步");
        p.daily();

        System.out.println("遇到大河时，坐船");
        p.passRiver();

        System.out.println("平时使用马代步");
        p.daily();

        System.out.println("遇到大河时，坐船");
        p.passRiver();
    }
}

interface Vehicle {
    void work ();
}

class Horse implements Vehicle { //使用了单例模式，因为马一直是白龙马

    public static Horse horse= new Horse(); //饿汉式

    private Horse() {}

    public static Horse getHorseInstance() {
        return horse;
    }

    @Override
    public void work() {
        System.out.println("马在地上跑...");
    }
}

class Boat implements Vehicle {
    @Override
    public void work() {
        System.out.println("船在水上开...");
    }
}

class Person {
    private String name;
    private Vehicle vehicle;

    public Person(String name) { //不传入交通工具则默认是马
        this.name = name;
        this.vehicle = Horse.getHorseInstance();
    }

    public Person(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void passRiver() { //过河方法
//        if (vehicle == null || vehicle instanceof Horse) {
            //如果当前没有交通工具，或交通工具是Horse，则new一个Boat
        if ( !(vehicle instanceof Boat) ) {
            //如果当前交通工具不是船（不是船则可能是Horse或者是null），
            // 则new一个Boat
            vehicle = new Boat(); //向上转型 Boat => Vehicle
        }
        vehicle.work();
    }

    public void daily() { //平时骑马
        if ( !(vehicle instanceof Horse) ) {
            vehicle = Horse.getHorseInstance(); //向上转型 Horse => Vehicle
        }
        vehicle.work();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}