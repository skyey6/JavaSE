package com.tky.chapter13.system;

import java.util.Arrays;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/24 12:12
 */
public class System_ {
    public static void main(String[] args) {
        //exit退出当前程序
        System.out.println("ok");
//        System.exit(0); //正常退出
        System.out.println("ends");

        //arraycopy：复制数组元素
        //一般使用Arrays.copyOf
        int[] src = {1, 2, 3};
        int[] dest = new int[4];// dest 当前是 {0,0,0}
        /*
         * @param      src      the source array.
         * @param      srcPos   starting position in the source array.
         * @param      dest     the destination array.
         * @param      destPos  starting position in the destination data.
         * @param      length   the number of array elements to be copied.
         */
        System.arraycopy(src,0,dest,0,3);
        System.out.println("dest=" + Arrays.toString(dest));

        //currentTimeMillens:返回当前时间距离 1970-1-1 的毫秒数
        System.out.println(System.currentTimeMillis());
        try {
            Thread.sleep(100);  //延时100ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis());

    }
}
