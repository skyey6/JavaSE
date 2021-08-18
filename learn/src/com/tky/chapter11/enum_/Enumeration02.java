package com.tky.chapter11.enum_;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/18 21:21
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.WINTER);
    }
}

//使用enum关键字实现枚举
enum Season2 {

    //如果使用enum实现枚举，需要将定义的常量对象写在最前面
    SPRING("春天","温暖"),  //如果有多个常量(对象)，
    SUMMER("夏天","炎热"),  //需要用 , 号隔开
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷");

    private String name;
    private String desc;//描述

//    public static final Season SPRING = new Season("春天","温暖");
//    public static final Season SUMMER = new Season("夏天","炎热");
//    public static final Season AUTUMN = new Season("秋天","凉爽");
//    public static final Season WINTER = new Season("冬天","寒冷");



    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}