package com.tky.chapter17;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/8 18:17
 */
public class CPUNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNum = runtime.availableProcessors();
        System.out.println(cpuNum);

    }
}
