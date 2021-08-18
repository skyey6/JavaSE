package com.tky.chapter07.类与对象;

public class VarArgs {
    //可计算传入任意个数的数字之和
    public int sum(int... args){
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            total += args[i];
        }
        return total;
    }

    public static void main(String[] args) {
        VarArgs method = new VarArgs();
        System.out.println(method.sum(1,2,3,4,5));
        System.out.println(method.sum(1,2,3));
    }
}

