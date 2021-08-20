package com.tky.chapter10.homework;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/20 14:51
 */
public class Homework08 {
    public static void main(String[] args) {
        //枚举与switch
        Color color = Color.BLUE;

        switch (color) {
            case RED:
                System.out.print("匹配到红色 ");
                color.show();
                break;
            case BLUE:
                System.out.print("匹配到蓝色 ");
                color.show();
                break;
            case BLACK:
                System.out.print("匹配到黑色 ");
                color.show();
                break;
            case YELLOW:
                System.out.print("匹配到黄色 ");
                color.show();
                break;
            case GREEN:
                System.out.print("匹配到绿色 ");
                color.show();
                break;
            default:
                System.out.println("匹配失败...");
        }
    }
}

interface MyInterface {
    void show();
}

enum Color implements MyInterface {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    private final int redValue;
    private final int greenValue;
    private final int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(this.name() + "的属性值为: " +
                "(" + redValue + "," + greenValue + "," + blueValue + ")");
    }
}
