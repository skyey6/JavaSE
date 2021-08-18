package com.tky.chapter07.类与对象;

public class Homework {
    public static void main(String[] args) {
        /*Book book = new Book("Wuthering Heights", 180.0);
        System.out.println(book);
        book.updatePrice();
        System.out.println(book);*/

        PassObject po = new PassObject();
        po.printAreas(new Circle(), 6);

    }
}

class Book{

    String name;
    double price;

    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void updatePrice() {
        if (this.price >= 150) {
            this.price = 150;
        } else if(this.price > 100) {
            this.price = 100;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Circle{

    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
}

class PassObject{

    public void printAreas(Circle c, int times){
        System.out.print("Radius\tArea\n");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.print(c.radius + "\t\t");
            System.out.println(c.findArea());
        }
    }
}