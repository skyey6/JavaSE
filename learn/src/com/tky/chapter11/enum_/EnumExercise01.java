package com.tky.chapter11.enum_;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/19 11:21
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Gender boy1 = Gender.BOY;
        Gender boy2 = Gender.BOY;
        System.out.println(boy1 == boy2); //true    //指向的是同一个空间

        System.out.println(boy1); //BOY     //调用了Enum的toString()

//        public final String name() {
//            return name;
//        }
    }
}

enum Gender {
    BOY,
    GIRL;
}
