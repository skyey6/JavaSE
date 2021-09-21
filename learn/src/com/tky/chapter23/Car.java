package com.tky.chapter23;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/20 15:26
 */
public class Car {
    public String brand = "bmw";
    public int price = 500000;
    public String color = "white";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
