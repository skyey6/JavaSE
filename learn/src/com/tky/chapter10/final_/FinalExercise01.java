package com.tky.chapter10.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("面积 = " + circle.getArea());
    }
}

class Circle {
    private double radius;
    private final double PI;// = 3.14;

    {
        PI = 3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
//        PI = 3.14;
    }

    //返回圆的面积
    public double getArea() {
        return PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
