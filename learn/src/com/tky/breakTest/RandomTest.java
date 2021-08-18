package com.tky.breakTest;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();
        do {
            int num = rand.nextInt(100)+1;
            System.out.println(num);
            if (num == 97) {
                break;
            }
        } while (true);

    }
}
