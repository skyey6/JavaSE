package com.tky.chapter13.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/23 21:08
 */
public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("世说新语", 100);
        books[1] = new Book("西游记", 120);
        books[2] = new Book("故事会2021", 15);
        books[3] = new Book("java从入门到放弃", 300);

        //按价格排序
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double val = ((Book)o1).getPrice() - ((Book)o2).getPrice();
                if (val == 0)
                    return 0;
                return val>0 ? 1 : -1;
            }
        });
        System.out.println(Arrays.toString(books));

        //按书名长度排序
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double val = ((Book)o1).getName().length() - ((Book)o2).getName().length();
                if (val == 0)
                    return 0;
                return val>0 ? 1 : -1;
            }
        });
        System.out.println(Arrays.toString(books));
    }

}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
