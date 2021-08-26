package com.tky.chapter14.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/26 12:59
 */
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book2("三国演义", "罗贯中", 10.1));
        col.add(new Book2("小李飞刀", "古龙", 5.1));
        col.add(new Book2("红楼梦", "曹雪芹", 34.6));

//        System.out.println(col);

        //遍历集合 col
        Iterator it = col.iterator();
        while (it.hasNext()) { //判断集合中是否还有数据
            Object o = it.next();
            System.out.println(o); //动态绑定，调用Book类的 toString()
        }

        //退出 while 循环后, 这时iterator迭代器，指向col中最后的元素
//        it.next(); //NoSuchElementException

        //如果希望再次遍历，需要重置迭代器
        System.out.println("=====第二次遍历=====");
        it = col.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }
}

class Book2 {
    private String name;
    private String author;
    private double price;

    public Book2(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
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
}
