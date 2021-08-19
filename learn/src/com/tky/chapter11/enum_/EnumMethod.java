package com.tky.chapter11.enum_;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/19 11:31
 * 演示Enum类的各种常用方法
 */
public class EnumMethod {
    public static void main(String[] args) {
        //以枚举类Season2为例，进行演示
        Season2 autumn = Season2.AUTUMN;

        //输出枚举对象的名称
        System.out.println(autumn.name());

        //输出枚举对象的序号，从0开始编号
        System.out.println(Season2.SPRING.ordinal());   //0
        System.out.println(autumn.ordinal());   //2

        //values方法，返回Season2数组，包含所有定义的枚举对象
        Season2[] values = Season2.values();
        for (Season2 item: values) {
            System.out.println(item);
        }

        System.out.println("===============================");
        Season2 spring = Season2.valueOf("SPRING"); //字符串必须为已有的常量名，否则报异常
        System.out.println(spring);

        //compareTo 比较两个枚举常量的编号
        //Season2.SPRING的编号0 减 Season2.AUTUMN的编号2，得到-2
        System.out.println(spring.compareTo(autumn)); //-2

    }
}
