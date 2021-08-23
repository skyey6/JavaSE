package com.tky.chapter13.math;

/**
 * @author tky
 * @version 1.0
 */
public class MathMethod {
    public static void main(String[] args) {
        //看看Math常用的方法(静态方法)
        //1.abs 绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);//9

        //2.pow 求幂
        double pow = Math.pow(2, 4);//2的4次方
        System.out.println(pow);//16

        //3.ceil 向上取整,返回>=该参数的最小整数(转成double);
        double ceil = Math.ceil(3.9);
        System.out.println(ceil);//4.0

        //4.floor 向下取整,返回<=该参数的最大整数(转成double)
        double floor = Math.floor(4.001);
        System.out.println(floor);//4.0

        //5.round 四舍五入  Math.floor(该参数+0.5)
        long round = Math.round(5.567);
        System.out.println(round);//6

        //6.sqrt 求开方
        //If the argument is NaN or less than zero, the result is NaN.
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);//3.0

        //7.random 求随机数
        //  random 返回的是 [0,1) 中的一个随机小数
        // 思考：请写出获取 [a,b) 之间的一个随机整数, a、b均为整数 ，比如 a=2, b=7
        // (int)(a + Math.random() * (b-a +1) )
        for(int i = 0; i < 10; i++) {
            System.out.print( (int)(Math.random()*6) + 2 + " ");
        }

        //max , min 返回最大值和最小值
        System.out.println();
        int min = Math.min(1, 9);
        int max = Math.max(45, 90);
        System.out.println("min=" + min);
        System.out.println("max=" + max);

    }
}
