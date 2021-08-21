package com.tky.chapter12.try_;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/21 16:49
 */
public class TryCatchExercise01 {
    public static void main(String[] args) {
        System.out.println(f1()); //4
    }

    public static int f1() {
        String[] names = new String[3];
        try {
            if (names[1].equals("tky")) { //空指针
                return 1;
            } else {
                names[3] = "hello";
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return 3;
        } finally {
            return 4; //由于finally必须执行，所以没有返回3
        }
    }
}
