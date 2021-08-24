package com.tky.chapter13.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/24 14:02
 */
public class Date01 {
    public static void main(String[] args) {
        //1. 获取当前系统时间
        //2. 这里的 Date 类是在 java.util 包
        //3. 默认输出的日期格式是国外的方式, 因此通常需要对格式进行转换
        Date d1 = new Date();
//        System.out.println(d1); //Tue Aug 24 14:12:15 CST 2021
        Date d2 = new Date(923456700); //通过指定毫秒数构造Date对象
//        System.out.println(d2);

        //1. 创建 SimpleDateFormat 对象，可以指定相应的格式
        //2. 这里的格式使用的字母是规定好，不能乱写
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String s1 = sdf.format(d1);
        String s2 = sdf.format(d2);
        System.out.println(s1);
        System.out.println(s2);

        //1. 可以把一个格式化的 String 转成对应的 Date
        //2. 得到 Date 后，在输出时仍按照国外的形式，如果希望指定格式输出，需要转换
        //3. 在把 String -> Date，使用的 sdf 格式需要和你给的 String 的格式一样，否则会抛出转换异常
        String s = "1997年12月25日 14:25:30 星期四";
        try {
            Date parsed = sdf.parse(s);
            System.out.println(sdf.format(parsed));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
