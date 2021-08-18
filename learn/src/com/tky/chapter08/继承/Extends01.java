package com.tky.chapter08.继承;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.examing();
        pupil.setScore(60);
        System.out.println(pupil);

        System.out.println("========");

        Graduate graduate = new Graduate();
        graduate.name = "大明";
        graduate.age = 22;
        graduate.examing();
        graduate.setScore(80);
        System.out.println(graduate);
    }
}
