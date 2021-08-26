package com.tky.chapter14.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/26 17:17
 */
public class ListExercise02 {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(new Book("西游记","吴承恩",199));
        list.add(new Book("三国演义","罗贯中",128));
        list.add(new Book("红楼梦","曹雪芹",145));
        list.add(new Book("水浒传","施耐庵",168));

        System.out.println("=========排序前=========");
        for (Object o : list) {
            System.out.println(o);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j+1, book1);
                }
            }
        }

        System.out.println("=========排序后=========");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
