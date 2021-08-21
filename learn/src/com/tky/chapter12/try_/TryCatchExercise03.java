package com.tky.chapter12.try_;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/21 17:03
 */
public class TryCatchExercise03 {
    public static void main(String[] args) {
        System.out.println(f1());
    }

    public static int f1() {
        int i = 1;
        try {
            i++;
            String[] names = new String[3];
            if (names[1].equals("tky")) { //空指针
                System.out.println(names[1]);
            } else {
                names[3] = "hello";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            //不会马上return，当前i的值保存到临时变量，finally代码块执行完后再返回
            return ++i; // i=3 => temp
        } finally {
            ++i;
            System.out.println("i=" + i);
        }
    }
}
