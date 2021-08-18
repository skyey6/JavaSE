package com.tky.chapter10.codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("coco");
        Movie movie2 = new Movie("飞屋环游记", 40, "彼特·道格特");
    }
}

class Movie {

    private String name;
    private double price;
    private String director;

    //下面的三个构造器都有相同的语句，代码冗余
    //这时可以把相同的语句放入一个代码块中
    {
        System.out.println("银幕打开...");
        System.out.println("播放广告...");
        System.out.println("播放电影...");
    }

    public Movie(String name) {
//        System.out.println("银幕打开...");
//        System.out.println("播放广告...");
//        System.out.println("播放电影...");
        this.name = name;
        System.out.println("Movie(String name) 被调用");
    }

    public Movie(String name, double price) {
//        System.out.println("银幕打开...");
//        System.out.println("播放广告...");
//        System.out.println("播放电影...");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
//        System.out.println("银幕打开...");
//        System.out.println("播放广告...");
//        System.out.println("播放电影...");
        this.name = name;
        this.price = price;
        this.director = director;
        System.out.println("Movie(String name, double price, String director) 被调用");
    }
}
