package com.tky.chapter11.enum_;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/19 11:55
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        
        for (Week item : Week.values()) {
            System.out.println(item);
        }

    }
}

enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天");

    private final String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
